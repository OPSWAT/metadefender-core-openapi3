function New-MetascanReport {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dataUnderscoreid},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${progressUnderscorepercentage},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.ProcessingResultsStringEnum]
        ${scanUnderscoreallUnderscoreresultUnderscorea},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.ProcessingResultsIndexEnum]
        ${scanUnderscoreallUnderscoreresultUnderscorei},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startUnderscoretime},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalUnderscoreavs},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalUnderscoretime},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.MetascanReportScanDetails]
        ${scanUnderscoredetails}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.MetascanReport' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.MetascanReport -ArgumentList @(
            ${dataUnderscoreid},
            ${progressUnderscorepercentage},
            ${scanUnderscoreallUnderscoreresultUnderscorea},
            ${scanUnderscoreallUnderscoreresultUnderscorei},
            ${startUnderscoretime},
            ${totalUnderscoreavs},
            ${totalUnderscoretime},
            ${scanUnderscoredetails}
        )
    }
}
