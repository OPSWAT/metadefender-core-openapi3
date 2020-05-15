function New-DLPResponseDlpInfoMetadataRemoval {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DLPResponseDlpInfoMetadataRemoval' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DLPResponseDlpInfoMetadataRemoval -ArgumentList @(
            ${result}
        )
    }
}
