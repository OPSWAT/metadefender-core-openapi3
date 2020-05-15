function New-AnalysisResultProcessInfoPostProcessing {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${actionsUnderscorefailed},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${actionsUnderscoreran},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${convertedUnderscoredestination},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${convertedUnderscoreto},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${copyUnderscoremoveUnderscoredestination},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.DeepCDRDetails]
        ${sanitizationUnderscoredetails}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AnalysisResultProcessInfoPostProcessing' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AnalysisResultProcessInfoPostProcessing -ArgumentList @(
            ${actionsUnderscorefailed},
            ${actionsUnderscoreran},
            ${convertedUnderscoredestination},
            ${convertedUnderscoreto},
            ${copyUnderscoremoveUnderscoredestination},
            ${sanitizationUnderscoredetails}
        )
    }
}
