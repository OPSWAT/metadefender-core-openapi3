function New-LicenseInformation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${daysUnderscoreleft},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${deployment},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${expiration},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${licensedUnderscoreengines},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${maxUnderscorenodeUnderscorecount},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${onlineUnderscoreactivated},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${productUnderscoreid},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${productUnderscorename}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.LicenseInformation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.LicenseInformation -ArgumentList @(
            ${daysUnderscoreleft},
            ${deployment},
            ${expiration},
            ${licensedUnderscoreengines},
            ${maxUnderscorenodeUnderscorecount},
            ${onlineUnderscoreactivated},
            ${productUnderscoreid},
            ${productUnderscorename}
        )
    }
}
