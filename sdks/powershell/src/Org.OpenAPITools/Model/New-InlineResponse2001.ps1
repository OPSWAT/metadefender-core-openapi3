function New-InlineResponse2001 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${maxage}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2001' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2001 -ArgumentList @(
            ${maxage}
        )
    }
}
