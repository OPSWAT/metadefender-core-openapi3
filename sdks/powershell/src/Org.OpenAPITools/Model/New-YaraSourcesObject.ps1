function New-YaraSourcesObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.YaraSourcesObjectLocalSources[]]
        ${localUnderscoresources},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.YaraSourcesObjectHttpSources[]]
        ${httpUnderscoresources}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.YaraSourcesObject' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.YaraSourcesObject -ArgumentList @(
            ${localUnderscoresources},
            ${httpUnderscoresources}
        )
    }
}
