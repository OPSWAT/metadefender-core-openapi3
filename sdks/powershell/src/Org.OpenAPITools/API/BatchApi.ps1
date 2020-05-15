function Invoke-BatchApiBatchCancel {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${batchId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: BatchApi-BatchCancel' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:BatchApi.BatchCancel(
            ${batchId},
            ${apikey}
        )
    }
}

function Invoke-BatchApiBatchClose {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${batchId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: BatchApi-BatchClose' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:BatchApi.BatchClose(
            ${batchId},
            ${apikey}
        )
    }
}

function Invoke-BatchApiBatchCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${rule},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userAgent},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userData}
    )

    Process {
        'Calling method: BatchApi-BatchCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:BatchApi.BatchCreate(
            ${apikey},
            ${rule},
            ${userAgent},
            ${userData}
        )
    }
}

function Invoke-BatchApiBatchSignedResult {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${batchId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: BatchApi-BatchSignedResult' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:BatchApi.BatchSignedResult(
            ${batchId},
            ${apikey}
        )
    }
}

function Invoke-BatchApiBatchStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${batchId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: BatchApi-BatchStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:BatchApi.BatchStatus(
            ${batchId},
            ${apikey}
        )
    }
}

