

# AdminConfigUpdateDisabledupdate

The JSON below mean that from Friday to Sunday (week starts on Monday (1), ends on Sunday (7)) from 8:00 to 16:00 you do not want to distribute packages. <i>From and to is the distance in minutes from 0:00 (8:00 → 480 minutes, 16:00 → 960 minutes)<i> 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days** | **String** | A particular day (index of the week) or a defined interval (Fri-Sun -&gt; 5-7) |  [optional]
**from** | **Integer** | When to start the lockdown, expressed in minutes (8 AM&#x3D;480) |  [optional]
**to** | **Integer** | When to end the lockdown, expressed in minutes (4 PM&#x3D;960) |  [optional]



