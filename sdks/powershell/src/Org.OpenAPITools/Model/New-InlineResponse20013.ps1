function New-InlineResponse20013 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${externalUnderscorenodesUnderscoreallowed},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${maxUnderscorenodeUnderscorecount},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.StatNodesStatuses[]]
        ${statuses}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse20013' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse20013 -ArgumentList @(
            ${externalUnderscorenodesUnderscoreallowed},
            ${maxUnderscorenodeUnderscorecount},
            ${statuses}
        )
    }
}
