function New-DLPRuleMatchResult {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${after},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${before},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${certainty},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${certaintyUnderscorescore},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${hit},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${isRedacted},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${severity}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DLPRuleMatchResult' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DLPRuleMatchResult -ArgumentList @(
            ${after},
            ${before},
            ${certainty},
            ${certaintyUnderscorescore},
            ${hit},
            ${isRedacted},
            ${severity}
        )
    }
}
