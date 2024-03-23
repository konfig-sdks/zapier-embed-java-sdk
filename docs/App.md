

# App

An app that integrates with Zapier.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Human readable name of the app |  [optional] |
|**description** | **String** | Human readable description of the app. |  [optional] |
|**type** | **String** | The type of this object. |  [readonly] |
|**id** | **UUID** | Unique id of the app |  |
|**categories** | [**List&lt;AppCategoriesInner&gt;**](AppCategoriesInner.md) | A list of categories to which this app belongs. Helpful in identifying apps by type and functionality. |  [optional] |
|**hexColor** | **String** | A branded color that can be used to represent the app. |  [optional] |
|**image** | **URI** | Default image/icon to represent the app. |  [optional] |
|**images** | [**AppImages**](AppImages.md) |  |  [optional] |
|**links** | [**AppLinks**](AppLinks.md) |  |  [optional] |



