function New-NewUserRoleRequestRights {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${agents},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${cert},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${configlog},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${engines},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${external},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${license},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${quarantine},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${retention},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${rule},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${scan},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${scanlog},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${skip},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${update},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${updatelog},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${users},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${workflow},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RolePermissionObject]
        ${zone}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.NewUserRoleRequestRights' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.NewUserRoleRequestRights -ArgumentList @(
            ${agents},
            ${cert},
            ${configlog},
            ${engines},
            ${external},
            ${license},
            ${quarantine},
            ${retention},
            ${rule},
            ${scan},
            ${scanlog},
            ${skip},
            ${update},
            ${updatelog},
            ${users},
            ${workflow},
            ${zone}
        )
    }
}
