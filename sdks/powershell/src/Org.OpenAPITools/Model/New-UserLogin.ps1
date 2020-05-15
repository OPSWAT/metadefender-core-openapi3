function New-UserLogin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${sessionUnderscoreid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.UserLogin' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.UserLogin -ArgumentList @(
            ${sessionUnderscoreid}
        )
    }
}
