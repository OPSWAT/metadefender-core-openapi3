function New-FileInformation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${displayUnderscorename},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${fileUnderscoresize},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fileUnderscoretype},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fileUnderscoretypeUnderscoredescription},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${md5},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${sha1},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${sha256},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${uploadUnderscoretimestamp}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.FileInformation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.FileInformation -ArgumentList @(
            ${displayUnderscorename},
            ${fileUnderscoresize},
            ${fileUnderscoretype},
            ${fileUnderscoretypeUnderscoredescription},
            ${md5},
            ${sha1},
            ${sha256},
            ${uploadUnderscoretimestamp}
        )
    }
}
