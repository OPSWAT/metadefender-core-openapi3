function New-BatchResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.BatchResponseBatchFiles]
        ${batchUnderscorefiles},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${batchUnderscoreid},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${isUnderscoreclosed},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.BatchResponseProcessInfo]
        ${processUnderscoreinfo},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.BatchResponseScanResults]
        ${scanUnderscoreresults},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${userUnderscoredata}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BatchResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BatchResponse -ArgumentList @(
            ${batchUnderscorefiles},
            ${batchUnderscoreid},
            ${isUnderscoreclosed},
            ${processUnderscoreinfo},
            ${scanUnderscoreresults},
            ${userUnderscoredata}
        )
    }
}
