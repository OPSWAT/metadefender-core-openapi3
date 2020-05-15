function New-UserResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${apikey},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${directoryUnderscoreid},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${displayUnderscorename},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${email},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${roles},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${uiUnderscoresettings}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.UserResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.UserResponse -ArgumentList @(
            ${apikey},
            ${directoryUnderscoreid},
            ${displayUnderscorename},
            ${email},
            ${name},
            ${roles},
            ${uiUnderscoresettings}
        )
    }
}
