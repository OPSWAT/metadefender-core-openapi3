function New-AdminConfigUpdateDisabledupdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${days},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${from},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${to}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdminConfigUpdateDisabledupdate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdminConfigUpdateDisabledupdate -ArgumentList @(
            ${days},
            ${from},
            ${to}
        )
    }
}
