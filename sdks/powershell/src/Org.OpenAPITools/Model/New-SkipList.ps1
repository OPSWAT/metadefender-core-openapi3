function New-SkipList {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${blacklist},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${skip},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${whitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SkipList' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SkipList -ArgumentList @(
            ${blacklist},
            ${skip},
            ${whitelist}
        )
    }
}
