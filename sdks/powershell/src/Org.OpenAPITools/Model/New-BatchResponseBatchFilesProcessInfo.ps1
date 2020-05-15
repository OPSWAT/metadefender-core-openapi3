function New-BatchResponseBatchFilesProcessInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${blockedUnderscorereason},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${progressUnderscorepercentage},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${verdicts}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BatchResponseBatchFilesProcessInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BatchResponseBatchFilesProcessInfo -ArgumentList @(
            ${blockedUnderscorereason},
            ${progressUnderscorepercentage},
            ${result},
            ${verdicts}
        )
    }
}
