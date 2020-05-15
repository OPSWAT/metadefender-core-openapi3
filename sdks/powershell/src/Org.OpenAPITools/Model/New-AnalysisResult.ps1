function New-AnalysisResult {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dataUnderscoreid},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DLPResponse]
        ${dlpUnderscoreinfo},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.FileInformation]
        ${fileUnderscoreinfo},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.AnalysisResultProcessInfo]
        ${processUnderscoreinfo},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.MetascanReport]
        ${scanUnderscoreresults},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.VulnerabilityResponse]
        ${vulnerabilityUnderscoreinfo},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.YaraReport]
        ${yara}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AnalysisResult' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AnalysisResult -ArgumentList @(
            ${dataUnderscoreid},
            ${dlpUnderscoreinfo},
            ${fileUnderscoreinfo},
            ${processUnderscoreinfo},
            ${scanUnderscoreresults},
            ${vulnerabilityUnderscoreinfo},
            ${yara}
        )
    }
}
