function New-DLPResponseDlpInfoHits {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPResponseDlpInfoHitsCcn]
        ${ccn}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DLPResponseDlpInfoHits' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DLPResponseDlpInfoHits -ArgumentList @(
            ${ccn}
        )
    }
}
