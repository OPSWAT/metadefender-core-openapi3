function New-AVEngineScanReport {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${defUnderscoretime},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${engUnderscoreid},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${location},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${scanUnderscoreresultUnderscorei},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${scanUnderscoretime},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${threatUnderscorefound},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${waitUnderscoretime}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AVEngineScanReport' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AVEngineScanReport -ArgumentList @(
            ${defUnderscoretime},
            ${engUnderscoreid},
            ${location},
            ${scanUnderscoreresultUnderscorei},
            ${scanUnderscoretime},
            ${threatUnderscorefound},
            ${waitUnderscoretime}
        )
    }
}
