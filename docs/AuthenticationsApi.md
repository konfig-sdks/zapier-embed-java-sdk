# AuthenticationsApi

All URIs are relative to *https://api.zapier.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAuthentication**](AuthenticationsApi.md#createNewAuthentication) | **POST** /authentications | Create Authentication |
| [**getAvailable**](AuthenticationsApi.md#getAvailable) | **GET** /authentications | Get Authentications |


<a name="createNewAuthentication"></a>
# **createNewAuthentication**
> AuthenticationsCreateNewAuthenticationResponse createNewAuthentication(authenticationsCreateNewAuthenticationRequest).execute();

Create Authentication

Creates a new Authentication for the provided App.  This endpoint requires the &#x60;authentication:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    AuthenticationsCreateNewAuthenticationRequestData data = new AuthenticationsCreateNewAuthenticationRequestData();
    try {
      AuthenticationsCreateNewAuthenticationResponse result = client
              .authentications
              .createNewAuthentication()
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationsApi#createNewAuthentication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationsCreateNewAuthenticationResponse> response = client
              .authentications
              .createNewAuthentication()
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationsApi#createNewAuthentication");
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
| **authenticationsCreateNewAuthenticationRequest** | [**AuthenticationsCreateNewAuthenticationRequest**](AuthenticationsCreateNewAuthenticationRequest.md)| Inputs to create a new Authentication | |

### Return type

[**AuthenticationsCreateNewAuthenticationResponse**](AuthenticationsCreateNewAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful response to create a new Authentication |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

<a name="getAvailable"></a>
# **getAvailable**
> AuthenticationsGetAvailableResponse getAvailable(app).limit(limit).offset(offset).execute();

Get Authentications

Fetch the available Authentications for the provided App. This will only return Authentications that are owned by the user and not those that are shared with them, since it&#39;&#39;s not possible to create Zaps with Authentications you don&#39;&#39;t own.  This endpoint requires the &#x60;authentication&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    UUID app = UUID.fromString("868f9d3c-2ea0-4f19-a32d-a61b276ab8de"); // A canonical App ID, as provided by the `/apps` endpoint.
    Integer limit = 10; // Used for paginating results. Specifies the maximum number of items to return per page. If this value is not set, it defaults to 10.
    Integer offset = 56; // Used for paginating results. Specifies the offset to use.
    try {
      AuthenticationsGetAvailableResponse result = client
              .authentications
              .getAvailable(app)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationsApi#getAvailable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationsGetAvailableResponse> response = client
              .authentications
              .getAvailable(app)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationsApi#getAvailable");
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
| **app** | **UUID**| A canonical App ID, as provided by the &#x60;/apps&#x60; endpoint. | |
| **limit** | **Integer**| Used for paginating results. Specifies the maximum number of items to return per page. If this value is not set, it defaults to 10. | [optional] [default to 10] |
| **offset** | **Integer**| Used for paginating results. Specifies the offset to use. | [optional] |

### Return type

[**AuthenticationsGetAvailableResponse**](AuthenticationsGetAvailableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request to get available Authentications for the provided App. |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

