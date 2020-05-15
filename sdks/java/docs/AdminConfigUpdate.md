

# AdminConfigUpdate

API object for /admin/config/update
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoupdateperiod** | **Integer** | The interval (in minutes) for checking for new updates. |  [optional]
**deleteafterimport** | **Boolean** | If you want to clean the pickup folder after the updates have been applied. |  [optional]
**disabledupdate** | [**List&lt;AdminConfigUpdateDisabledupdate&gt;**](AdminConfigUpdateDisabledupdate.md) | Lockdown a time interval when the engines are not allowed to update. |  [optional]
**pickupfolder** | **String** | The folder where MetaDefender will look for the new engine files. |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | Define where the updates will be loaded from. &lt;p&gt; This can be either:   * &#x60;internet&#x60; -&gt; if selected, will check for new updates every &#x60;autoupdateperiod&#x60; minutes   * &#x60;folder&#x60; -&gt; make sure that MetaDefender has access/permission to that folder   * &#x60;manual&#x60; -&gt; requires manually uploading the packages in Inventory &gt; Modules &gt; Upload package.  |  [optional]



## Enum: SourceEnum

Name | Value
---- | -----
INTERNET | &quot;internet&quot;
FOLDER | &quot;folder&quot;
MANUAL | &quot;manual&quot;



