function Invoke-YaraApiYaraPackageGenerate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: YaraApi-YaraPackageGenerate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:YaraApi.YaraPackageGenerate(
            ${apikey}
        )
    }
}

function Invoke-YaraApiYaraPackageStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: YaraApi-YaraPackageStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:YaraApi.YaraPackageStatus(
            ${apikey}
        )
    }
}

function Invoke-YaraApiYaraSourcesGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: YaraApi-YaraSourcesGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:YaraApi.YaraSourcesGet(
            ${apikey}
        )
    }
}

function Invoke-YaraApiYaraSourcesPut {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.YaraSourcesObject]
        ${yaraSourcesObject}
    )

    Process {
        'Calling method: YaraApi-YaraSourcesPut' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:YaraApi.YaraSourcesPut(
            ${apikey},
            ${yaraSourcesObject}
        )
    }
}

