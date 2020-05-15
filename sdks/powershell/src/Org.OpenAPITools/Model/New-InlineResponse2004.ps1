function New-InlineResponse2004 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2004' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2004 -ArgumentList @(
            ${result}
        )
    }
}
