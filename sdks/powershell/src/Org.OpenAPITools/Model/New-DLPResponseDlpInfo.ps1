function New-DLPResponseDlpInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${certainty},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${errors},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${filename},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPResponseDlpInfoHits]
        ${hits},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPResponseDlpInfoMetadataRemoval]
        ${metadataUnderscoreremoval},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPResponseDlpInfoRedact]
        ${redact},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${severity},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${verdict},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPResponseDlpInfoWatermark]
        ${watermark}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DLPResponseDlpInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DLPResponseDlpInfo -ArgumentList @(
            ${certainty},
            ${errors},
            ${filename},
            ${hits},
            ${metadataUnderscoreremoval},
            ${redact},
            ${severity},
            ${verdict},
            ${watermark}
        )
    }
}
