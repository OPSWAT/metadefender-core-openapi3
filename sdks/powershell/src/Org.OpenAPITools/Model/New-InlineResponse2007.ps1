function New-InlineResponse2007 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${status},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startUnderscoretime},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.InlineResponse2007Issues]
        ${issues}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2007' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2007 -ArgumentList @(
            ${status},
            ${startUnderscoretime},
            ${issues}
        )
    }
}
