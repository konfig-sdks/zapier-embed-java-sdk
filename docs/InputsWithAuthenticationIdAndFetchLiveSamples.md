

# InputsWithAuthenticationIdAndFetchLiveSamples

The common data object that includes inputs and an authentication id.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authentication** | **Object** | An Authentication ID, as provided by the &#x60;/authentications&#x60; endpoint. |  |
|**inputs** | **Object** | The current set of input fields in a JSON object, where each key is the &#x60;id&#x60; of an Input Field, and the corresponding value the current value of the field. |  |
|**fetchLiveSamples** | **Boolean** | Whether to retrieve live samples for the field |  [optional] |



