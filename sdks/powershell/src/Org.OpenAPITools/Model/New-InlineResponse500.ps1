function New-InlineResponse500 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${err}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse500' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse500 -ArgumentList @(
            ${err}
        )
    }
}
