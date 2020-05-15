function New-BatchResponseBatchFiles {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${batchUnderscorecount},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.BatchResponseBatchFilesFilesInBatch[]]
        ${filesUnderscoreinUnderscorebatch},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${firstUnderscoreindex},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${pageUnderscoresize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BatchResponseBatchFiles' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BatchResponseBatchFiles -ArgumentList @(
            ${batchUnderscorecount},
            ${filesUnderscoreinUnderscorebatch},
            ${firstUnderscoreindex},
            ${pageUnderscoresize}
        )
    }
}
