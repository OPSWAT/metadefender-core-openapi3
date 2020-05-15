function Invoke-AnalysisApiAnalysisRules {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userAgent}
    )

    Process {
        'Calling method: AnalysisApi-AnalysisRules' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AnalysisApi.AnalysisRules(
            ${userAgent}
        )
    }
}

function Invoke-AnalysisApiFileAnalysisCancel {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${dataId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: AnalysisApi-FileAnalysisCancel' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AnalysisApi.FileAnalysisCancel(
            ${dataId},
            ${apikey}
        )
    }
}

function Invoke-AnalysisApiFileAnalysisGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${dataId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: AnalysisApi-FileAnalysisGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AnalysisApi.FileAnalysisGet(
            ${dataId},
            ${apikey}
        )
    }
}

function Invoke-AnalysisApiFileAnalysisPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filename},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filepath},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${userAgent},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${rule},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${workflow},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${batch},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${archivepwd},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${metadata},
        [Parameter(Position = 9, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.URI]
        ${callbackurl},
        [Parameter(Position = 10, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${body}
    )

    Process {
        'Calling method: AnalysisApi-FileAnalysisPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AnalysisApi.FileAnalysisPost(
            ${apikey},
            ${filename},
            ${filepath},
            ${userAgent},
            ${rule},
            ${workflow},
            ${batch},
            ${archivepwd},
            ${metadata},
            ${callbackurl},
            ${body}
        )
    }
}

function Invoke-AnalysisApiSanitizedFile {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${dataId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: AnalysisApi-SanitizedFile' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AnalysisApi.SanitizedFile(
            ${dataId},
            ${apikey}
        )
    }
}

function Invoke-AnalysisApiWebhookStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${dataId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: AnalysisApi-WebhookStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AnalysisApi.WebhookStatus(
            ${dataId},
            ${apikey}
        )
    }
}

