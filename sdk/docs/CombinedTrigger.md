

# CombinedTrigger

A file based triggered constrained by a time window  Supports the ability to specify multiple trigger files,  to choose whether a schedule is triggered for every file or first file,  has the option to trigger the schedule at the end of the time window, if any or no files arrived

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | **String** | The start of the time window when a file can arrive to trigger the schedule  Cannot exceed 24 hours | 
**endTime** | **String** | The end of the time window when a file can arrive to trigger the schedule  Must be after the Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.StartTime and cannot exceed 24 hours | 
**file** | **String** | The file name or partial path of the file that will trigger the job  E.G: &#x60;fileName&#x60; or &#x60;folder1/folder2/someFileName&#x60; | 
**pollPeriod** | **Integer** | The frequency, in seconds, at which to poll the S3 bucket for the file.  Must be lower than the difference in seconds between Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.EndTime and Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.StartTime  Defaults to 5. |  [optional]
**bucket** | **String** | The S3 bucket where to watch for the trigger file | 
**triggerEveryFile** | **Boolean** | Specify whether to trigger every time the file is updated |  [optional]
**endOfTimeWindowOption** | **String** | Specifies the behaviour of the trigger when the time window ends  Available options are \&quot;Always\&quot;, \&quot;NoFile\&quot;, \&quot;FileReceived\&quot;, \&quot;Never\&quot;  Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.EndOfTimeWindowOption | 
**daysAvailable** | **DaysOfWeek** |  | 



