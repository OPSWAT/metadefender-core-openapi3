function New-StatNodesEngines {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${active},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dbUnderscorever},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${defUnderscoretime},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engUnderscorename},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engUnderscorever},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engineUnderscoretype},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.StatNodesEngines' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.StatNodesEngines -ArgumentList @(
            ${active},
            ${dbUnderscorever},
            ${defUnderscoretime},
            ${engUnderscorename},
            ${engUnderscorever},
            ${engineUnderscoretype},
            ${id}
        )
    }
}
