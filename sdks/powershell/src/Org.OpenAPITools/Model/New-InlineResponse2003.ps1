function New-InlineResponse2003 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2003' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2003 -ArgumentList @(
            ${result}
        )
    }
}
