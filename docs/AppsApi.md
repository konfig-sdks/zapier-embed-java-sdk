# AppsApi

All URIs are relative to *https://api.zapier.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listPopular**](AppsApi.md#listPopular) | **GET** /apps | Get Apps |


<a name="listPopular"></a>
# **listPopular**
> AppsListPopularResponse listPopular().limit(limit).offset(offset).category(category).query(query).ids(ids).execute();

Get Apps

This endpoint returns a list of popular apps.  Keep in mind that Zapier built-in apps will not be returned and the order of the result is by app popularity.  This endpoint requires the &#x60;zap&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZapierEmbed client = new ZapierEmbed(configuration);
    Integer limit = 56; // Used for paginating results. Specifies the amount of apps to return.
    Integer offset = 56; // Used for paginating results. Specifies the offset of the apps to return.
    String category = "category_example"; // Categories that apps must have in order to be returned in the response. E.g. Accounting (`accounting`), AI Tools (`ai-tools`), and All (`all`). The full list of valid categories can be retrieved using the `category` endpoint, detailed [here](https://platform.zapier.com/embed/partner-api#get-v1categories).
    String query = "query_example"; // Parameter to limit the results to apps whose titles match the provided query.
    String ids = "ids_example"; // Parameter to restrict the results to apps whose ID matches those in the provided comma-separated value. Cannot be combined with `category`.
    try {
      AppsListPopularResponse result = client
              .apps
              .listPopular()
              .limit(limit)
              .offset(offset)
              .category(category)
              .query(query)
              .ids(ids)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#listPopular");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppsListPopularResponse> response = client
              .apps
              .listPopular()
              .limit(limit)
              .offset(offset)
              .category(category)
              .query(query)
              .ids(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#listPopular");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Used for paginating results. Specifies the amount of apps to return. | [optional] |
| **offset** | **Integer**| Used for paginating results. Specifies the offset of the apps to return. | [optional] |
| **category** | **String**| Categories that apps must have in order to be returned in the response. E.g. Accounting (&#x60;accounting&#x60;), AI Tools (&#x60;ai-tools&#x60;), and All (&#x60;all&#x60;). The full list of valid categories can be retrieved using the &#x60;category&#x60; endpoint, detailed [here](https://platform.zapier.com/embed/partner-api#get-v1categories). | [optional] |
| **query** | **String**| Parameter to limit the results to apps whose titles match the provided query. | [optional] |
| **ids** | **String**| Parameter to restrict the results to apps whose ID matches those in the provided comma-separated value. Cannot be combined with &#x60;category&#x60;. | [optional] |

### Return type

[**AppsListPopularResponse**](AppsListPopularResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

