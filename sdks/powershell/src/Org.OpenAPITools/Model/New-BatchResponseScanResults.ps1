function New-BatchResponseScanResults {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${batchUnderscoreid},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.ProcessingResultsStringEnum]
        ${scanUnderscoreallUnderscoreresultUnderscorea},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.ProcessingResultsIndexEnum]
        ${scanUnderscoreallUnderscoreresultUnderscorei},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startUnderscoretime},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalUnderscoreavs},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalUnderscoretime}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BatchResponseScanResults' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BatchResponseScanResults -ArgumentList @(
            ${batchUnderscoreid},
            ${scanUnderscoreallUnderscoreresultUnderscorea},
            ${scanUnderscoreallUnderscoreresultUnderscorei},
            ${startUnderscoretime},
            ${totalUnderscoreavs},
            ${totalUnderscoretime}
        )
    }
}
