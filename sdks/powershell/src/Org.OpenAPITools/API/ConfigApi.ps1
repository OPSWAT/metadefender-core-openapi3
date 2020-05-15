function Invoke-ConfigApiConfigAuditLog {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.UNKNOWN_BASE_TYPE]
        ${uNKNOWNBASETYPE}
    )

    Process {
        'Calling method: ConfigApi-ConfigAuditLog' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigAuditLog(
            ${apikey},
            ${uNKNOWNBASETYPE}
        )
    }
}

function Invoke-ConfigApiConfigGetSkipHash {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: ConfigApi-ConfigGetSkipHash' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigGetSkipHash(
            ${apikey}
        )
    }
}

function Invoke-ConfigApiConfigQuarantine {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.UNKNOWN_BASE_TYPE]
        ${uNKNOWNBASETYPE}
    )

    Process {
        'Calling method: ConfigApi-ConfigQuarantine' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigQuarantine(
            ${apikey},
            ${uNKNOWNBASETYPE}
        )
    }
}

function Invoke-ConfigApiConfigSanitizedRepo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.InlineObject1]
        ${inlineObject1}
    )

    Process {
        'Calling method: ConfigApi-ConfigSanitizedRepo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigSanitizedRepo(
            ${apikey},
            ${inlineObject1}
        )
    }
}

function Invoke-ConfigApiConfigScanHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.UNKNOWN_BASE_TYPE]
        ${uNKNOWNBASETYPE}
    )

    Process {
        'Calling method: ConfigApi-ConfigScanHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigScanHistory(
            ${apikey},
            ${uNKNOWNBASETYPE}
        )
    }
}

function Invoke-ConfigApiConfigSession {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.AdminConfigSession]
        ${adminConfigSession}
    )

    Process {
        'Calling method: ConfigApi-ConfigSession' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigSession(
            ${apikey},
            ${adminConfigSession}
        )
    }
}

function Invoke-ConfigApiConfigUpdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.AdminConfigUpdate]
        ${adminConfigUpdate}
    )

    Process {
        'Calling method: ConfigApi-ConfigUpdate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigUpdate(
            ${apikey},
            ${adminConfigUpdate}
        )
    }
}

function Invoke-ConfigApiConfigUpdateSkipHash {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.SkipList]
        ${skipList}
    )

    Process {
        'Calling method: ConfigApi-ConfigUpdateSkipHash' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigUpdateSkipHash(
            ${apikey},
            ${skipList}
        )
    }
}

function Invoke-ConfigApiConfigUpdateWebhook {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.AdminConfigWebhook]
        ${adminConfigWebhook}
    )

    Process {
        'Calling method: ConfigApi-ConfigUpdateWebhook' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigUpdateWebhook(
            ${apikey},
            ${adminConfigWebhook}
        )
    }
}

function Invoke-ConfigApiConfigWebhook {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: ConfigApi-ConfigWebhook' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ConfigApi.ConfigWebhook(
            ${apikey}
        )
    }
}

