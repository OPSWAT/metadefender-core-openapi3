function New-YaraSourcesObjectLocalSources {
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
        'Creating object: Org.OpenAPITools.Model.YaraSourcesObjectLocalSources' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.YaraSourcesObjectLocalSources -ArgumentList @(
            ${source},
            ${state}
        )
    }
}
