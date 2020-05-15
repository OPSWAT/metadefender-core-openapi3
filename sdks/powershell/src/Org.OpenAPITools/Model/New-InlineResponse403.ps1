function New-InlineResponse403 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${err}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse403' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse403 -ArgumentList @(
            ${err}
        )
    }
}
