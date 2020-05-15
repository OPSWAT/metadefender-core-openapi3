function New-ProcessingResultsStringEnum {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ProcessingResultsStringEnum' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ProcessingResultsStringEnum -ArgumentList @(
        )
    }
}
