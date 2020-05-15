function New-UserRequestAllOf {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${password}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.UserRequestAllOf' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.UserRequestAllOf -ArgumentList @(
            ${password}
        )
    }
}
