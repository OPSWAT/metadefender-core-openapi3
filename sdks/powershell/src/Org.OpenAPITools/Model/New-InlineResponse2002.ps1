function New-InlineResponse2002 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2002' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2002 -ArgumentList @(
            ${result}
        )
    }
}
