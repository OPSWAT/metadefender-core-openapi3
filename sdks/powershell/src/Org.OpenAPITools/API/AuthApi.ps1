function Invoke-AuthApiUserChangePass {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.InlineObject2]
        ${inlineObject2}
    )

    Process {
        'Calling method: AuthApi-UserChangePass' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AuthApi.UserChangePass(
            ${apikey},
            ${inlineObject2}
        )
    }
}

function Invoke-AuthApiUserLogin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.InlineObject]
        ${inlineObject}
    )

    Process {
        'Calling method: AuthApi-UserLogin' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AuthApi.UserLogin(
            ${inlineObject}
        )
    }
}

function Invoke-AuthApiUserLogout {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: AuthApi-UserLogout' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AuthApi.UserLogout(
            ${apikey}
        )
    }
}

