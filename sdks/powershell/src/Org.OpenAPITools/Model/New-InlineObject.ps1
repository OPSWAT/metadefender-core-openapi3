function New-InlineObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${user},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${password}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject -ArgumentList @(
            ${user},
            ${password}
        )
    }
}
