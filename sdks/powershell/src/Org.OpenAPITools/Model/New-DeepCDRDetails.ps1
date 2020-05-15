function New-DeepCDRDetails {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DeepCDRDetailsDetails[]]
        ${details}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DeepCDRDetails' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DeepCDRDetails -ArgumentList @(
            ${description},
            ${details}
        )
    }
}
