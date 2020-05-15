function New-InlineResponse20012 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${active},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${defUnderscoretime},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${downloadUnderscoreprogress},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${downloadUnderscoretime},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engUnderscoreid},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engUnderscorename},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engUnderscoretype},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engUnderscorever},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engineUnderscoretype},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${state}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse20012' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse20012 -ArgumentList @(
            ${active},
            ${defUnderscoretime},
            ${downloadUnderscoreprogress},
            ${downloadUnderscoretime},
            ${engUnderscoreid},
            ${engUnderscorename},
            ${engUnderscoretype},
            ${engUnderscorever},
            ${engineUnderscoretype},
            ${state}
        )
    }
}
