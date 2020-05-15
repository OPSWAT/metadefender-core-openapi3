function New-DLPResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPResponseDlpInfo]
        ${dlpUnderscoreinfo}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DLPResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DLPResponse -ArgumentList @(
            ${dlpUnderscoreinfo}
        )
    }
}
