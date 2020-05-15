function New-MetascanReportScanDetails {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.AVEngineScanReport]
        ${ClamAV}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.MetascanReportScanDetails' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.MetascanReportScanDetails -ArgumentList @(
            ${ClamAV}
        )
    }
}
