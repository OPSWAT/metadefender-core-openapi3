function New-AdminConfigWebhook {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${maxretrytime},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${delayduration},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${deplayprogression}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdminConfigWebhook' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdminConfigWebhook -ArgumentList @(
            ${maxretrytime},
            ${delayduration},
            ${deplayprogression}
        )
    }
}
