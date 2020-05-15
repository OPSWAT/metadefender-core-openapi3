function New-BatchResponseProcessInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${blockedUnderscorereason},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${fileUnderscoretypeUnderscoreskippedUnderscorescan},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${profile},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${userUnderscoreagent},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${username}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BatchResponseProcessInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BatchResponseProcessInfo -ArgumentList @(
            ${blockedUnderscorereason},
            ${fileUnderscoretypeUnderscoreskippedUnderscorescan},
            ${profile},
            ${result},
            ${userUnderscoreagent},
            ${username}
        )
    }
}
