

# BucketWatcherTrigger

Trigger based on activity from an S3 bucket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | **String** | The file name or partial path of the file that will trigger the job  E.G: &#x60;fileName&#x60; or &#x60;folder1/folder2/someFileName&#x60; |  [optional]
**pollPeriod** | **Integer** | The frequency, in seconds, at which to poll the S3 bucket for the file.  Defaults to 5. |  [optional]
**bucket** | **String** | The S3 bucket where to watch for the trigger file |  [optional]



