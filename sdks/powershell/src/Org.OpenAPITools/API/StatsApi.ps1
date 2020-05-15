function Invoke-StatsApiEnginesStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: StatsApi-EnginesStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:StatsApi.EnginesStatus(
            ${apikey}
        )
    }
}

function Invoke-StatsApiNodesStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: StatsApi-NodesStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:StatsApi.NodesStatus(
            ${apikey}
        )
    }
}

function Invoke-StatsApiProductVersion {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: StatsApi-ProductVersion' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:StatsApi.ProductVersion(
            ${apikey}
        )
    }
}

