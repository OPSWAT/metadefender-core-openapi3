function New-ProcessingResultsIndexEnum {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ProcessingResultsIndexEnum' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ProcessingResultsIndexEnum -ArgumentList @(
        )
    }
}
