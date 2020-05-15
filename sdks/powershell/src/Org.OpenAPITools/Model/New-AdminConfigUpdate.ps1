function New-AdminConfigUpdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${autoupdateperiod},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${deleteafterimport},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.AdminConfigUpdateDisabledupdate[]]
        ${disabledupdate},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pickupfolder},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${source}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdminConfigUpdate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdminConfigUpdate -ArgumentList @(
            ${autoupdateperiod},
            ${deleteafterimport},
            ${disabledupdate},
            ${pickupfolder},
            ${source}
        )
    }
}
