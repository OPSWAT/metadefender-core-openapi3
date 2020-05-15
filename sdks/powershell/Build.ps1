function Get-FunctionsToExport {
    [CmdletBinding()]
    Param (
        [Parameter(Mandatory = $true, ValueFromPipelineByPropertyName = $true)]
        [ValidateNotNullOrEmpty()]
        [Alias('FullName')]
        $Path
    )

    Process {
        $Token = $null
        $ParserErr = $null

        $Ast = [System.Management.Automation.Language.Parser]::ParseFile(
            $Path,
            [ref]$Token,
            [ref]$ParserErr
        )

        if ($ParserErr) {
            throw $ParserErr
        } else {
            foreach ($name in 'Begin', 'Process', 'End') {
	            foreach ($Statement in $Ast."${name}Block".Statements) {
		            if (
                        [String]::IsNullOrWhiteSpace($Statement.Name) -or
                        $Statement.Extent.ToString() -notmatch
                        ('function\W+{0}' -f $Statement.Name)
                    ) {
			            continue
		            }

		            $Statement.Name
	            }
            }
        }
    }
}

$ScriptDir = Split-Path $script:MyInvocation.MyCommand.Path
$ClientPath = ("$ScriptDir\csharp\OpenAPIClient" | Resolve-Path).ProviderPath
$FunctionPath = 'API', 'Model' | ForEach-Object {Join-Path "$ScriptDir\src\Org.OpenAPITools\" $_}
$BinPath = "$ScriptDir\src\Org.OpenAPITools\Bin"

Start-Process -FilePath "$ClientPath\build.bat" -WorkingDirectory $ClientPath -Wait -NoNewWindow

if (!(Test-Path "$ScriptDir\src\Org.OpenAPITools\Bin" -PathType Container)) {
    New-Item "$ScriptDir\src\Org.OpenAPITools\Bin" -ItemType Directory > $null
}

Copy-Item "$ClientPath\bin\*.dll" $BinPath

$Manifest = @{
    Path = "$ScriptDir\src\Org.OpenAPITools\Org.OpenAPITools.psd1"

    Author = 'OpenAPI Generator Team'
    CompanyName = 'openapitools.org'
    Description = 'Org.OpenAPITools - the PowerShell module for MetaDefender Core'

    RootModule = 'Org.OpenAPITools.psm1'
    Guid = '{7C80E2F2-0D1F-490B-AF74-45B70245E744}' # Has to be static, otherwise each new build will be considered different module

    PowerShellVersion = '3.0'

    RequiredAssemblies = Get-ChildItem "$BinPath\*.dll" | ForEach-Object {
        Join-Path $_.Directory.Name $_.Name
    }

    FunctionsToExport = $FunctionPath | Get-ChildItem -Filter *.ps1 | Get-FunctionsToExport

    VariablesToExport = @()
    AliasesToExport = @()
    CmdletsToExport = @()

    # Should we use prefix to prevent command name collisions?
    # https://www.sapien.com/blog/2016/02/15/use-prefixes-to-prevent-command-name-collision/
    #
    # Kirk Munro recommends against it:
    # https://www.sapien.com/blog/2016/02/15/use-prefixes-to-prevent-command-name-collision/#comment-20820
    #
    # If not, we'd need to generate functions name with prefix. For examples,
    #
    # DefaultCommandPrefix = 'AdminApi'
    # DefaultCommandPrefix = 'AnalysisApi'
    # DefaultCommandPrefix = 'AuthApi'
    # DefaultCommandPrefix = 'BatchApi'
    # DefaultCommandPrefix = 'ConfigApi'
    # DefaultCommandPrefix = 'EnginesApi'
    # DefaultCommandPrefix = 'LicenseApi'
    # DefaultCommandPrefix = 'StatsApi'
    # DefaultCommandPrefix = 'YaraApi'
}

New-ModuleManifest @Manifest
