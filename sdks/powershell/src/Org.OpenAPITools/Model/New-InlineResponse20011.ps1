function New-InlineResponse20011 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${productUnderscoreid},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${version}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse20011' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse20011 -ArgumentList @(
            ${productUnderscoreid},
            ${version}
        )
    }
}
