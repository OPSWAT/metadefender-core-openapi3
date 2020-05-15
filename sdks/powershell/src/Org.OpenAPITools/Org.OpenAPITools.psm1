#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: Org.OpenAPITools.Api.AdminApi' | Write-Verbose
$Script:AdminApi= New-Object -TypeName Org.OpenAPITools.Api.AdminApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.AnalysisApi' | Write-Verbose
$Script:AnalysisApi= New-Object -TypeName Org.OpenAPITools.Api.AnalysisApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.AuthApi' | Write-Verbose
$Script:AuthApi= New-Object -TypeName Org.OpenAPITools.Api.AuthApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.BatchApi' | Write-Verbose
$Script:BatchApi= New-Object -TypeName Org.OpenAPITools.Api.BatchApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.ConfigApi' | Write-Verbose
$Script:ConfigApi= New-Object -TypeName Org.OpenAPITools.Api.ConfigApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.EnginesApi' | Write-Verbose
$Script:EnginesApi= New-Object -TypeName Org.OpenAPITools.Api.EnginesApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.LicenseApi' | Write-Verbose
$Script:LicenseApi= New-Object -TypeName Org.OpenAPITools.Api.LicenseApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.StatsApi' | Write-Verbose
$Script:StatsApi= New-Object -TypeName Org.OpenAPITools.Api.StatsApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.YaraApi' | Write-Verbose
$Script:YaraApi= New-Object -TypeName Org.OpenAPITools.Api.YaraApi -ArgumentList @($null)


#endregion
