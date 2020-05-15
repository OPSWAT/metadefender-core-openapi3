function New-InlineResponse2006 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2006' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2006 -ArgumentList @(
            ${result}
        )
    }
}
