# ZapsApi

All URIs are relative to *https://api.zapier.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createZap**](ZapsApi.md#createZap) | **POST** /zaps | Create a Zap |
| [**getFilteredZaps**](ZapsApi.md#getFilteredZaps) | **GET** /zaps | Get Zaps |


<a name="createZap"></a>
# **createZap**
> ZapsCreateZapResponse createZap().expand(expand).zapsCreateZapRequest(zapsCreateZapRequest).execute();

Create a Zap

This URL creates a new Zap based on a series of steps and a given title. &#x60;is_enabled&#x60; must be set to true when creating a new Zap.  This endpoint requires the &#x60;zap:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ZapsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    Zap data = new Zap();
    String expand = "expand_example"; // A comma separated list of Zap fields that should be expanded from ids to full objects in the response. If a field may not be expanded, its encoded form will be returned instead.
    try {
      ZapsCreateZapResponse result = client
              .zaps
              .createZap(data)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZapsApi#createZap");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ZapsCreateZapResponse> response = client
              .zaps
              .createZap(data)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZapsApi#createZap");
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
| **expand** | **String**| A comma separated list of Zap fields that should be expanded from ids to full objects in the response. If a field may not be expanded, its encoded form will be returned instead. | [optional] |
| **zapsCreateZapRequest** | [**ZapsCreateZapRequest**](ZapsCreateZapRequest.md)|  | [optional] |

### Return type

[**ZapsCreateZapResponse**](ZapsCreateZapResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

<a name="getFilteredZaps"></a>
# **getFilteredZaps**
> ZapsGetFilteredZapsResponse getFilteredZaps().limit(limit).offset(offset).inputs(inputs).expand(expand).execute();

Get Zaps

This endpoint returns a list of Zaps for the authenticated Zapier user.  The &#x60;expand&#x60; array can be used to expand selected fields into full objects in the response.  Inputs with keys can also be passed to filter Zaps by certain criteria.  This endpoint requires the &#x60;zap&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ZapsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    Integer limit = 56; // Used for paginating results. Specifies the amount of apps to return
    Integer offset = 56; // Used for paginating results. Specifies the offset of the apps to return
    Map<String, String> inputs = new HashMap(); // You may pass inputs[KEY]=VALUE1,VALUE2 to filter for Zaps that contain those settings. For example, if your OAuth app is Trello you may filter for Zaps that contain a certain Trello board using inputs[board]=BOARD_ID — Keys are defined by your app on the developer platform.
    String expand = "steps.action"; // A comma separated list of Zap fields that should be expanded from ids to full objects in the response. If a field may not be expanded, its encoded form will be returned instead.
    try {
      ZapsGetFilteredZapsResponse result = client
              .zaps
              .getFilteredZaps()
              .limit(limit)
              .offset(offset)
              .inputs(inputs)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZapsApi#getFilteredZaps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ZapsGetFilteredZapsResponse> response = client
              .zaps
              .getFilteredZaps()
              .limit(limit)
              .offset(offset)
              .inputs(inputs)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZapsApi#getFilteredZaps");
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
| **limit** | **Integer**| Used for paginating results. Specifies the amount of apps to return | [optional] |
| **offset** | **Integer**| Used for paginating results. Specifies the offset of the apps to return | [optional] |
| **inputs** | [**Map&lt;String, String&gt;**](String.md)| You may pass inputs[KEY]&#x3D;VALUE1,VALUE2 to filter for Zaps that contain those settings. For example, if your OAuth app is Trello you may filter for Zaps that contain a certain Trello board using inputs[board]&#x3D;BOARD_ID — Keys are defined by your app on the developer platform. | [optional] |
| **expand** | **String**| A comma separated list of Zap fields that should be expanded from ids to full objects in the response. If a field may not be expanded, its encoded form will be returned instead. | [optional] |

### Return type

[**ZapsGetFilteredZapsResponse**](ZapsGetFilteredZapsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

