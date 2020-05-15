function Invoke-AdminApiAdminImport {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${body}
    )

    Process {
        'Calling method: AdminApi-AdminImport' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminImport(
            ${apikey},
            ${body}
        )
    }
}

function Invoke-AdminApiRoleCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.NewUserRoleRequest]
        ${newUserRoleRequest}
    )

    Process {
        'Calling method: AdminApi-RoleCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.RoleCreate(
            ${apikey},
            ${newUserRoleRequest}
        )
    }
}

function Invoke-AdminApiUserCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.UserRequest]
        ${userRequest}
    )

    Process {
        'Calling method: AdminApi-UserCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.UserCreate(
            ${apikey},
            ${userRequest}
        )
    }
}

