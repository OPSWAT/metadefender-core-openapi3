function New-NewUserRoleRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${displayUnderscorename},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.NewUserRoleRequestRights]
        ${rights}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.NewUserRoleRequest' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.NewUserRoleRequest -ArgumentList @(
            ${name},
            ${displayUnderscorename},
            ${rights}
        )
    }
}
