function New-DLPResponseDlpInfoHitsCcn {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${displayUnderscorename},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPRuleMatchResult[]]
        ${hits}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DLPResponseDlpInfoHitsCcn' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DLPResponseDlpInfoHitsCcn -ArgumentList @(
            ${displayUnderscorename},
            ${hits}
        )
    }
}
