function New-StatNodesIssues {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${severity}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.StatNodesIssues' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.StatNodesIssues -ArgumentList @(
            ${description},
            ${severity}
        )
    }
}
