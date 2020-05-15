function New-DLPResponseDlpInfoRedact {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DLPResponseDlpInfoRedact' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DLPResponseDlpInfoRedact -ArgumentList @(
            ${result}
        )
    }
}
