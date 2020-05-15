function New-InlineObject2 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${oldUnderscorepassword},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${newUnderscorepassword}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject2' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject2 -ArgumentList @(
            ${oldUnderscorepassword},
            ${newUnderscorepassword}
        )
    }
}
