function New-AnalysisResultProcessInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${blockedUnderscorereason},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${fileUnderscoretypeUnderscoreskippedUnderscorescan},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${outdatedUnderscoredata},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${processingUnderscoretime},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${profile},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${progressUnderscorepercentage},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${queueUnderscoretime},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${result},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${userUnderscoreagent},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${username},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${verdicts},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.AnalysisResultProcessInfoPostProcessing]
        ${postUnderscoreprocessing}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AnalysisResultProcessInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AnalysisResultProcessInfo -ArgumentList @(
            ${blockedUnderscorereason},
            ${fileUnderscoretypeUnderscoreskippedUnderscorescan},
            ${outdatedUnderscoredata},
            ${processingUnderscoretime},
            ${profile},
            ${progressUnderscorepercentage},
            ${queueUnderscoretime},
            ${result},
            ${userUnderscoreagent},
            ${username},
            ${verdicts},
            ${postUnderscoreprocessing}
        )
    }
}
