function New-YaraSourcesObjectHttpSources {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${source},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${state}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.YaraSourcesObjectHttpSources' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.YaraSourcesObjectHttpSources -ArgumentList @(
            ${source},
            ${state}
        )
    }
}
