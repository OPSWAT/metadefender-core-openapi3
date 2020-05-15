function New-InlineResponse2008 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${dataUnderscoreid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2008' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2008 -ArgumentList @(
            ${dataUnderscoreid}
        )
    }
}
