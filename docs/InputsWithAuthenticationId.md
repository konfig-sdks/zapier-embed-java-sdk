

# InputsWithAuthenticationId

The common data object that includes inputs and an authentication id.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authentication** | **Object** | An Authentication ID, as provided by the &#x60;/authentications&#x60; endpoint. |  |
|**inputs** | **Object** | The current set of input fields in a JSON object, where each key is the &#x60;id&#x60; of an Input Field, and the corresponding value the current value of the field. |  |
|**limit** | **Integer** | Used for paginating results. Specifies the maximum number of items to return per page. |  [optional] |
|**offset** | **Integer** | Used for paginating results. Specifies the offset to use. |  [optional] |



