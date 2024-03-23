

# Zap

The definition of the Zap that will be created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The human readable name of the Zap. |  |
|**type** | **String** | The type of this object. |  [optional] [readonly] |
|**id** | **UUID** | A unique identifier of the Zap. |  [optional] [readonly] |
|**isEnabled** | **Boolean** | Whether the Zap is enabled (running) or not. |  [optional] |
|**lastSuccessfulRunDate** | **Object** | The date/time at which this Zap last ran sucessfully. A null value indicates that a Zap has never run successfully. |  [optional] [readonly] |
|**steps** | [**Set&lt;ZapStepsInner&gt;**](ZapStepsInner.md) | An ordered list of steps that define the logic of the Zap. |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**links** | [**ZapLinks**](ZapLinks.md) |  |  [optional] |



