function New-InlineObject1 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${maxage}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject1' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject1 -ArgumentList @(
            ${maxage}
        )
    }
}
