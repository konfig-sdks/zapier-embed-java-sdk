

# IField

A field that is an input to an Action, often eventually used to form the HTTP request that is made to a Partner API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of this Input Field |  [optional] |
|**description** | **String** | A longer markdown formatted description of this Input Field, often containing helpful hints on how to fill this particular field in. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of this object. |  [readonly] |
|**id** | **String** |  |  |
|**defaultValue** | **String** | The default value of this Input Field |  [optional] |
|**dependsOn** | **List&lt;String&gt;** | An array of ids that this field has a dependency on. If the value of these fields changes, the value of this field is no longer valid. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | An optional formatting hint, only provided when the &#x60;value_type&#x60; field is &#x60;STRING&#x60;. Useful for displaying more friendly inputs to a user. If the format is &#x60;SELECT&#x60;, you are expected to fetch the possible Choices from the &#x60;/choices&#x60; endpoint. |  [optional] |
|**invalidatesInputFields** | **Boolean** | If true, changes to this field invalidate the presence of all other fields for this action and they must be refetched. |  [optional] |
|**isRequired** | **Boolean** | If true, this field must be filled in for the action to execute. |  [optional] |
|**items** | [**InputFieldItems**](InputFieldItems.md) |  |  [optional] |
|**placeholder** | **String** | A placeholder for this Input Field. |  [optional] |
|**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The type of this Input Field. The &#x60;OBJECT&#x60; type accepts a flat key-value dictionary where the values can only be strings. The &#x60;ARRAY&#x60; type accepts an array of values - see &#x60;items&#x60; for the type. All other types accept string values. |  [optional] |
|**fields** | [**List&lt;IField&gt;**](IField.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INPUT_FIELD | &quot;input_field&quot; |
| INFO_FIELD | &quot;info_field&quot; |
| FIELDSET | &quot;fieldset&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| DATETIME | &quot;DATETIME&quot; |
| MULTILINE | &quot;MULTILINE&quot; |
| PASSWORD | &quot;PASSWORD&quot; |
| CODE | &quot;CODE&quot; |
| FILE | &quot;FILE&quot; |
| SELECT | &quot;SELECT&quot; |



## Enum: ValueTypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;STRING&quot; |
| NUMBER | &quot;NUMBER&quot; |
| INTEGER | &quot;INTEGER&quot; |
| BOOLEAN | &quot;BOOLEAN&quot; |
| ARRAY | &quot;ARRAY&quot; |
| OBJECT | &quot;OBJECT&quot; |



