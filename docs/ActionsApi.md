# ActionsApi

All URIs are relative to *https://api.zapier.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getChoices**](ActionsApi.md#getChoices) | **POST** /actions/{action}/inputs/{input}/choices | Get Choices |
| [**getInputFields**](ActionsApi.md#getInputFields) | **POST** /actions/{action}/inputs | Get Input Fields |
| [**getOutputFields**](ActionsApi.md#getOutputFields) | **POST** /actions/{action}/outputs | Get Output Fields |
| [**listAvailableActions**](ActionsApi.md#listAvailableActions) | **GET** /actions | Get Actions |
| [**testActionExecution**](ActionsApi.md#testActionExecution) | **POST** /actions/{action}/test | Test an action (step) |


<a name="getChoices"></a>
# **getChoices**
> ActionsGetChoicesResponse getChoices(action, input).page(page).actionsGetChoicesRequest(actionsGetChoicesRequest).execute();

Get Choices

Get the possible values for an Input Field that is marked as &#x60;SELECT&#x60;.  This endpoint requires the &#x60;zap&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    ActionsGetChoicesRequestData data = new ActionsGetChoicesRequestData();
    String action = "uag:87b1c14e-ef30-43d5-9395-6c6514dbb123"; // An Action ID, as provided by the `/actions` endpoint.
    String input = "lead_id"; // An Input Field ID, as provided by the `/inputs` endpoint.
    String page = "1"; // The page of choices to return, defaults to the first
    try {
      ActionsGetChoicesResponse result = client
              .actions
              .getChoices(data, action, input)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getChoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ActionsGetChoicesResponse> response = client
              .actions
              .getChoices(data, action, input)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getChoices");
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
| **action** | **String**| An Action ID, as provided by the &#x60;/actions&#x60; endpoint. | |
| **input** | **String**| An Input Field ID, as provided by the &#x60;/inputs&#x60; endpoint. | |
| **page** | **String**| The page of choices to return, defaults to the first | [optional] [default to 1] |
| **actionsGetChoicesRequest** | [**ActionsGetChoicesRequest**](ActionsGetChoicesRequest.md)|  | [optional] |

### Return type

[**ActionsGetChoicesResponse**](ActionsGetChoicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response for getting the requested Input Fields. |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

<a name="getInputFields"></a>
# **getInputFields**
> ActionsGetInputFieldsResponse getInputFields(action).actionsGetInputFieldsRequest(actionsGetInputFieldsRequest).execute();

Get Input Fields

Get the Input Fields for a particular Action, using the provided authentication and inputs.  This endpoint requires the &#x60;zap:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    String action = "uag:87b1c14e-ef30-43d5-9395-6c6514dbb123"; // An Action ID, as provided by the `/actions` endpoint.
    InputsWithAuthenticationId data = new InputsWithAuthenticationId();
    try {
      ActionsGetInputFieldsResponse result = client
              .actions
              .getInputFields(action)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getInputFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ActionsGetInputFieldsResponse> response = client
              .actions
              .getInputFields(action)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getInputFields");
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
| **action** | **String**| An Action ID, as provided by the &#x60;/actions&#x60; endpoint. | |
| **actionsGetInputFieldsRequest** | [**ActionsGetInputFieldsRequest**](ActionsGetInputFieldsRequest.md)| Common inputs with inputs and an authentication id. | [optional] |

### Return type

[**ActionsGetInputFieldsResponse**](ActionsGetInputFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response for getting the input fields for a particular Action. |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

<a name="getOutputFields"></a>
# **getOutputFields**
> ActionsGetOutputFieldsResponse getOutputFields(action).actionsGetOutputFieldsRequest(actionsGetOutputFieldsRequest).execute();

Get Output Fields

Get the Output Fields for a particular Action, using the provided authentication and inputs.  This endpoint requires the &#x60;zap:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    String action = "uag:87b1c14e-ef30-43d5-9395-6c6514dbb123"; // An Action ID, as provided by the `/actions` endpoint.
    InputsWithAuthenticationIdAndFetchLiveSamples data = new InputsWithAuthenticationIdAndFetchLiveSamples();
    try {
      ActionsGetOutputFieldsResponse result = client
              .actions
              .getOutputFields(action)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getOutputFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ActionsGetOutputFieldsResponse> response = client
              .actions
              .getOutputFields(action)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getOutputFields");
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
| **action** | **String**| An Action ID, as provided by the &#x60;/actions&#x60; endpoint. | |
| **actionsGetOutputFieldsRequest** | [**ActionsGetOutputFieldsRequest**](ActionsGetOutputFieldsRequest.md)| Common inputs with inputs, an authentication id and a parameter to optionally retrieve live samples for the field | [optional] |

### Return type

[**ActionsGetOutputFieldsResponse**](ActionsGetOutputFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request to get the Output Fields for an Action. |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

<a name="listAvailableActions"></a>
# **listAvailableActions**
> ActionsListAvailableActionsResponse listAvailableActions(app, actionType).execute();

Get Actions

Fetch the available actions for the provided App. It&#39;s typical to filter by type so that only actions that make sense for a particular step are shown. For example only showing reads for the first step in a Zap.  This endpoint requires the &#x60;zap&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    UUID app = UUID.fromString("868f9d3c-2ea0-4f19-a32d-a61b276ab8de"); // A canonical App ID, as provided by the `/apps` endpoint.
    String actionType = "READ"; // The type of Action to filter for.
    try {
      ActionsListAvailableActionsResponse result = client
              .actions
              .listAvailableActions(app, actionType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#listAvailableActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ActionsListAvailableActionsResponse> response = client
              .actions
              .listAvailableActions(app, actionType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#listAvailableActions");
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
| **actionType** | **String**| The type of Action to filter for. | [enum: READ, WRITE] |

### Return type

[**ActionsListAvailableActionsResponse**](ActionsListAvailableActionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A valid response for fetching available actions for the App. |  -  |
| **0** | An unexpected error has occurred but details are available. |  -  |

<a name="testActionExecution"></a>
# **testActionExecution**
> ActionsTestActionExecutionResponse testActionExecution(action).actionsTestActionExecutionRequest(actionsTestActionExecutionRequest).execute();

Test an action (step)

Tests the action (step) in the third party api, using the provided authentication and inputs. On a successful test returns 200 and the result of executing the action, otherwise it returns a 400 and details about the failure.  This endpoint requires the &#x60;zap:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    String action = "action_example"; // An Action ID, as provided by the `/actions` endpoint.
    InputsWithAuthenticationIdNoPage data = new InputsWithAuthenticationIdNoPage();
    try {
      ActionsTestActionExecutionResponse result = client
              .actions
              .testActionExecution(action)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.get());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#testActionExecution");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ActionsTestActionExecutionResponse> response = client
              .actions
              .testActionExecution(action)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#testActionExecution");
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
| **action** | **String**| An Action ID, as provided by the &#x60;/actions&#x60; endpoint. | |
| **actionsTestActionExecutionRequest** | [**ActionsTestActionExecutionRequest**](ActionsTestActionExecutionRequest.md)| Authentication id and inputs (such as &#x60;worksheet&#x60;, &#x60;spreadsheet&#x60; for google sheets, &#x60;text&#x60; and &#x60;channel&#x60; for slack) used to test the action. | [optional] |

### Return type

[**ActionsTestActionExecutionResponse**](ActionsTestActionExecutionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/json, application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

