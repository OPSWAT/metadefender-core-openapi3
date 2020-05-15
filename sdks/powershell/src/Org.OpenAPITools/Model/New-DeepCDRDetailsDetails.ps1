function New-DeepCDRDetailsDetails {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${action},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${objectUnderscorename},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${count},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${objectUnderscoredetails},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fileUnderscorename}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DeepCDRDetailsDetails' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DeepCDRDetailsDetails -ArgumentList @(
            ${action},
            ${objectUnderscorename},
            ${count},
            ${objectUnderscoredetails},
            ${fileUnderscorename}
        )
    }
}
