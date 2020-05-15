function New-AdminConfigSession {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${absoluteSessionTimeout},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${allowCrossIpSessions},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${allowDuplicateSession},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${sessionTimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdminConfigSession' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdminConfigSession -ArgumentList @(
            ${absoluteSessionTimeout},
            ${allowCrossIpSessions},
            ${allowDuplicateSession},
            ${sessionTimeout}
        )
    }
}
