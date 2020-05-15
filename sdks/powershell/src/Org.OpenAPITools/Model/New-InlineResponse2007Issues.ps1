function New-InlineResponse2007Issues {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.InlineResponse2007IssuesGeneral[]]
        ${general},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.InlineResponse2007IssuesSource[]]
        ${source}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2007Issues' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2007Issues -ArgumentList @(
            ${general},
            ${source}
        )
    }
}
