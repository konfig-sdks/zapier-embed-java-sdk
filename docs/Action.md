

# Action

An Action is an operation that can be performed against a third-party API; either a read or a write. A Zap is composed of a read, followed by one or more writes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of this Action. |  |
|**description** | **String** | A longer description of this Action, usually describing what it does in more detail. |  |
|**type** | **String** | The type of this object. |  [readonly] |
|**id** | **String** |  |  |
|**key** | **String** | The developer provided identifier for this Action. |  |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | The type of this Action. |  |
|**app** | **Object** |  |  |
|**isInstant** | **Boolean** | Will be set to &#x60;true&#x60; if this Action triggers instantly. May only be &#x60;true&#x60; when &#x60;type&#x60; is &#x60;READ&#x60;. |  |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| READ | &quot;READ&quot; |
| WRITE | &quot;WRITE&quot; |



