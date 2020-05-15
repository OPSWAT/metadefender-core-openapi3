function New-InlineResponse2007IssuesSource {
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
        'Creating object: Org.OpenAPITools.Model.InlineResponse2007IssuesSource' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2007IssuesSource -ArgumentList @(
            ${severity},
            ${message}
        )
    }
}
