function New-YaraReport {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${hits},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.ScanResultEnum]
        ${verdict}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.YaraReport' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.YaraReport -ArgumentList @(
            ${hits},
            ${verdict}
        )
    }
}
