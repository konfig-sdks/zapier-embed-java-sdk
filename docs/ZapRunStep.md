

# ZapRunStep


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Represents the current state or progress of the Zap Run Step. |  [optional] [readonly] |
|**startTime** | **OffsetDateTime** | The specific time when the execution of the step in the Zap run began. |  [optional] [readonly] |



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



