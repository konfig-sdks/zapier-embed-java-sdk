# ExperimentalApi

All URIs are relative to *https://api.zapier.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getZapRuns**](ExperimentalApi.md#getZapRuns) | **GET** /zap-runs | Get Zap Runs |


<a name="getZapRuns"></a>
# **getZapRuns**
> ExperimentalGetZapRunsResponse getZapRuns().fromDate(fromDate).toDate(toDate).zapId(zapId).limit(limit).offset(offset).search(search).statuses(statuses).execute();

Get Zap Runs

This endpoint is a first version tool that delivers basic yet essential details about their executed Zap runs. As an evolving interface, this first version serves foundational information about Zap runs.  _However, it&#39;s important to note that this is an initial implementation and the **response payload is not definitive**. Our aim is to continually iterate and enhance this API, refining its capabilities and data output, to progressively deliver more valuable and useful information in future versions._  This endpoint requires the &#x60;zap:runs&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.  Please note that since this is an experimental tool, if you&#39;re interested in gaining access, you must contact our support team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierEmbed;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExperimentalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zapier.com/v2";
    ZapierEmbed client = new ZapierEmbed(configuration);
    String fromDate = "2024-01-01T10:09:08.07"; // Find Zap runs equal to or newer than this date. If not provided, results default to last 30 days' Zap Runs.
    String toDate = "2023-01-02T11:10:09.08"; // Find Zap runs less than this date.
    String zapId = "001fa849-dc8e-aca6-a09b-ba705bceada1"; // Find Zap runs for the specified Zap ID.
    Integer limit = 10; // Maximum number of returned Zap Runs.
    Integer offset = 10; // Number of Zap Runs to skip.
    String search = "search_example"; // Performs a text search against the `zap_title`, `data_in`, and `data_out` fields, returning only zap runs that match the specified keywords.
    String statuses = "delayed"; // Accepts one or more status values separated by commas, enabling the filtering of zap runs based on the specified status or statuses provided.
    try {
      ExperimentalGetZapRunsResponse result = client
              .experimental
              .getZapRuns()
              .fromDate(fromDate)
              .toDate(toDate)
              .zapId(zapId)
              .limit(limit)
              .offset(offset)
              .search(search)
              .statuses(statuses)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentalApi#getZapRuns");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExperimentalGetZapRunsResponse> response = client
              .experimental
              .getZapRuns()
              .fromDate(fromDate)
              .toDate(toDate)
              .zapId(zapId)
              .limit(limit)
              .offset(offset)
              .search(search)
              .statuses(statuses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentalApi#getZapRuns");
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
| **fromDate** | **String**| Find Zap runs equal to or newer than this date. If not provided, results default to last 30 days&#39; Zap Runs. | [optional] |
| **toDate** | **String**| Find Zap runs less than this date. | [optional] |
| **zapId** | **String**| Find Zap runs for the specified Zap ID. | [optional] |
| **limit** | **Integer**| Maximum number of returned Zap Runs. | [optional] |
| **offset** | **Integer**| Number of Zap Runs to skip. | [optional] |
| **search** | **String**| Performs a text search against the &#x60;zap_title&#x60;, &#x60;data_in&#x60;, and &#x60;data_out&#x60; fields, returning only zap runs that match the specified keywords. | [optional] |
| **statuses** | **String**| Accepts one or more status values separated by commas, enabling the filtering of zap runs based on the specified status or statuses provided. | [optional] [enum: delayed, scheduled, pending, error, error_handled, halted, throttled, held, filtered, skipped, success] |

### Return type

[**ExperimentalGetZapRunsResponse**](ExperimentalGetZapRunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

