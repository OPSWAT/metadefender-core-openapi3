function New-InlineResponse200 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${cleanuprange}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse200' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse200 -ArgumentList @(
            ${cleanuprange}
        )
    }
}
