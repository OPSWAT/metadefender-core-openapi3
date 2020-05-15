function New-InlineResponse2007IssuesGeneral {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${severity},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${message}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2007IssuesGeneral' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2007IssuesGeneral -ArgumentList @(
            ${severity},
            ${message}
        )
    }
}
