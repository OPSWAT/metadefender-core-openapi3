function New-BatchId {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${batchUnderscoreid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BatchId' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BatchId -ArgumentList @(
            ${batchUnderscoreid}
        )
    }
}
