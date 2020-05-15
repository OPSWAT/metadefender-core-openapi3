function New-StatNodesStatuses {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${address},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${cpuUnderscorecores},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.StatNodesEngines[]]
        ${engines},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${freeUnderscorediskUnderscorespace},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.StatNodesIssues[]]
        ${issues},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${load},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${os},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${scanUnderscorequeue},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalUnderscorememory},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${version}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.StatNodesStatuses' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.StatNodesStatuses -ArgumentList @(
            ${address},
            ${cpuUnderscorecores},
            ${engines},
            ${freeUnderscorediskUnderscorespace},
            ${id},
            ${issues},
            ${load},
            ${os},
            ${scanUnderscorequeue},
            ${totalUnderscorememory},
            ${version}
        )
    }
}
