function Invoke-EnginesApiEngineDisable {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${engineId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: EnginesApi-EngineDisable' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnginesApi.EngineDisable(
            ${engineId},
            ${apikey}
        )
    }
}

function Invoke-EnginesApiEngineEnable {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${engineId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: EnginesApi-EngineEnable' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnginesApi.EngineEnable(
            ${engineId},
            ${apikey}
        )
    }
}

function Invoke-EnginesApiEnginePin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${engineId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${type}
    )

    Process {
        'Calling method: EnginesApi-EnginePin' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnginesApi.EnginePin(
            ${engineId},
            ${apikey},
            ${type}
        )
    }
}

function Invoke-EnginesApiEngineUnpin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${engineId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${type}
    )

    Process {
        'Calling method: EnginesApi-EngineUnpin' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnginesApi.EngineUnpin(
            ${engineId},
            ${apikey},
            ${type}
        )
    }
}

