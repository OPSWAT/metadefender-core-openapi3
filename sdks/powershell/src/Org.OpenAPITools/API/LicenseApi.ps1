function Invoke-LicenseApiLicenseActivation {
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
        'Calling method: LicenseApi-LicenseActivation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:LicenseApi.LicenseActivation(
            ${apikey},
            ${uNKNOWNBASETYPE}
        )
    }
}

function Invoke-LicenseApiLicenseGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${apikey}
    )

    Process {
        'Calling method: LicenseApi-LicenseGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:LicenseApi.LicenseGet(
            ${apikey}
        )
    }
}

function Invoke-LicenseApiLicenseUpload {
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
        'Calling method: LicenseApi-LicenseUpload' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:LicenseApi.LicenseUpload(
            ${apikey},
            ${body}
        )
    }
}

