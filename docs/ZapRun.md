

# ZapRun


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Zap Run Identifier. |  [optional] |
|**startTime** | **OffsetDateTime** | The specific time when the Zap Run was initiated. |  [optional] [readonly] |
|**endTime** | **OffsetDateTime** | The specific time when the Zap Run was finished. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Represents the current state or progress of the Zap Run |  [optional] [readonly] |
|**zapTitle** | **String** | Refers to the name or title of the specific Zap that the run is associated with. |  [optional] [readonly] |
|**steps** | [**List&lt;ZapRunStep&gt;**](ZapRunStep.md) | The list of sequential actions or processes involved in the execution of the associated Zap run. |  [optional] |
|**dataIn** | **String** | The information about the data inputted into and logged out from a specific Zap Run during its execution. |  [optional] |
|**dataOut** | **String** | The information logged out from a specific Zap Run during its execution. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DELAYED | &quot;delayed&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| PENDING | &quot;pending&quot; |
| ERROR | &quot;error&quot; |
| HALTED | &quot;halted&quot; |
| THROTTLED | &quot;throttled&quot; |
| HELD | &quot;held&quot; |
| FILTERED | &quot;filtered&quot; |
| SKIPPED | &quot;skipped&quot; |
| SUCCESS | &quot;success&quot; |



