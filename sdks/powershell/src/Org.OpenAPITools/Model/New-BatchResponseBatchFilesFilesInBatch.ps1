function New-BatchResponseBatchFilesFilesInBatch {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dataUnderscoreid},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${detectedUnderscoreby},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${displayUnderscorename},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${fileUnderscoresize},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fileUnderscoretype},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fileUnderscoretypeUnderscoredescription},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.BatchResponseBatchFilesProcessInfo]
        ${processUnderscoreinfo},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${progressUnderscorepercentage},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.ProcessingResultsStringEnum]
        ${scanUnderscoreallUnderscoreresultUnderscorea},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.ProcessingResultsIndexEnum]
        ${scanUnderscoreallUnderscoreresultUnderscorei},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${scannedUnderscorewith}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BatchResponseBatchFilesFilesInBatch' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BatchResponseBatchFilesFilesInBatch -ArgumentList @(
            ${dataUnderscoreid},
            ${detectedUnderscoreby},
            ${displayUnderscorename},
            ${fileUnderscoresize},
            ${fileUnderscoretype},
            ${fileUnderscoretypeUnderscoredescription},
            ${processUnderscoreinfo},
            ${progressUnderscorepercentage},
            ${scanUnderscoreallUnderscoreresultUnderscorea},
            ${scanUnderscoreallUnderscoreresultUnderscorei},
            ${scannedUnderscorewith}
        )
    }
}
