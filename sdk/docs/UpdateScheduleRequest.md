

# UpdateScheduleRequest

Create a schedule definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | [**ResourceId**](ResourceId.md) |  | 
**name** | **String** | The updated name of the schedule | 
**description** | **String** | The updated description of the schedule | 
**author** | **String** | The updated author of the schedule |  [optional]
**owner** | **String** | The update owner of the schedule |  [optional]
**arguments** | **Map&lt;String, String&gt;** | Updated arguments to be passed to the job  Note: The new arguments will completely replace old arguments |  [optional]
**trigger** | [**Trigger**](Trigger.md) |  |  [optional]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Updated notifications for this schedule | 
**enabled** | **Boolean** | Specify whether schedule is enabled or not  Defaults to true |  [optional]



