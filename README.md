<div align="center">

[![Visit Zapier](./header.png)](https://zapier.com)

# [Zapier](https://zapier.com)

The Zapier Embed API.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Zapier&serviceName=Embed&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>zapier-embed-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:zapier-embed-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/zapier-embed-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.zapier.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActionsApi* | [**getChoices**](docs/ActionsApi.md#getChoices) | **POST** /actions/{action}/inputs/{input}/choices | Get Choices
*ActionsApi* | [**getInputFields**](docs/ActionsApi.md#getInputFields) | **POST** /actions/{action}/inputs | Get Input Fields
*ActionsApi* | [**getOutputFields**](docs/ActionsApi.md#getOutputFields) | **POST** /actions/{action}/outputs | Get Output Fields
*ActionsApi* | [**listAvailableActions**](docs/ActionsApi.md#listAvailableActions) | **GET** /actions | Get Actions
*ActionsApi* | [**testActionExecution**](docs/ActionsApi.md#testActionExecution) | **POST** /actions/{action}/test | Test an action (step)
*AppsApi* | [**listPopular**](docs/AppsApi.md#listPopular) | **GET** /apps | Get Apps
*AuthenticationsApi* | [**createNewAuthentication**](docs/AuthenticationsApi.md#createNewAuthentication) | **POST** /authentications | Create Authentication
*AuthenticationsApi* | [**getAvailable**](docs/AuthenticationsApi.md#getAvailable) | **GET** /authentications | Get Authentications
*ExperimentalApi* | [**getZapRuns**](docs/ExperimentalApi.md#getZapRuns) | **GET** /zap-runs | Get Zap Runs
*ZapsApi* | [**createZap**](docs/ZapsApi.md#createZap) | **POST** /zaps | Create a Zap
*ZapsApi* | [**getFilteredZaps**](docs/ZapsApi.md#getFilteredZaps) | **GET** /zaps | Get Zaps


## Documentation for Models

 - [Action](docs/Action.md)
 - [ActionsGetChoicesRequest](docs/ActionsGetChoicesRequest.md)
 - [ActionsGetChoicesRequestData](docs/ActionsGetChoicesRequestData.md)
 - [ActionsGetChoicesResponse](docs/ActionsGetChoicesResponse.md)
 - [ActionsGetInputFieldsRequest](docs/ActionsGetInputFieldsRequest.md)
 - [ActionsGetInputFieldsResponse](docs/ActionsGetInputFieldsResponse.md)
 - [ActionsGetOutputFieldsRequest](docs/ActionsGetOutputFieldsRequest.md)
 - [ActionsGetOutputFieldsResponse](docs/ActionsGetOutputFieldsResponse.md)
 - [ActionsListAvailableActionsResponse](docs/ActionsListAvailableActionsResponse.md)
 - [ActionsListAvailableActionsdefaultResponse](docs/ActionsListAvailableActionsdefaultResponse.md)
 - [ActionsTestActionExecution200Response](docs/ActionsTestActionExecution200Response.md)
 - [ActionsTestActionExecutionRequest](docs/ActionsTestActionExecutionRequest.md)
 - [ActionsTestActionExecutionResponse](docs/ActionsTestActionExecutionResponse.md)
 - [App](docs/App.md)
 - [AppCategoriesInner](docs/AppCategoriesInner.md)
 - [AppImages](docs/AppImages.md)
 - [AppLinks](docs/AppLinks.md)
 - [AppsListPopularResponse](docs/AppsListPopularResponse.md)
 - [Authentication](docs/Authentication.md)
 - [AuthenticationsCreateNewAuthenticationRequest](docs/AuthenticationsCreateNewAuthenticationRequest.md)
 - [AuthenticationsCreateNewAuthenticationRequestData](docs/AuthenticationsCreateNewAuthenticationRequestData.md)
 - [AuthenticationsCreateNewAuthenticationResponse](docs/AuthenticationsCreateNewAuthenticationResponse.md)
 - [AuthenticationsGetAvailableResponse](docs/AuthenticationsGetAvailableResponse.md)
 - [Choice](docs/Choice.md)
 - [ExperimentalGetZapRunsResponse](docs/ExperimentalGetZapRunsResponse.md)
 - [Fieldset](docs/Fieldset.md)
 - [IField](docs/IField.md)
 - [InfoField](docs/InfoField.md)
 - [InputField](docs/InputField.md)
 - [InputFieldItems](docs/InputFieldItems.md)
 - [InputsWithAuthenticationId](docs/InputsWithAuthenticationId.md)
 - [InputsWithAuthenticationIdAndFetchLiveSamples](docs/InputsWithAuthenticationIdAndFetchLiveSamples.md)
 - [InputsWithAuthenticationIdNoPage](docs/InputsWithAuthenticationIdNoPage.md)
 - [JSONError](docs/JSONError.md)
 - [JSONErrorMeta](docs/JSONErrorMeta.md)
 - [Links](docs/Links.md)
 - [LinksWithPage](docs/LinksWithPage.md)
 - [Meta](docs/Meta.md)
 - [MetaWithPage](docs/MetaWithPage.md)
 - [ModelIF](docs/ModelIF.md)
 - [OutputField](docs/OutputField.md)
 - [Zap](docs/Zap.md)
 - [ZapLinks](docs/ZapLinks.md)
 - [ZapRun](docs/ZapRun.md)
 - [ZapRunStep](docs/ZapRunStep.md)
 - [ZapStepsInner](docs/ZapStepsInner.md)
 - [ZapsCreateZapRequest](docs/ZapsCreateZapRequest.md)
 - [ZapsCreateZapResponse](docs/ZapsCreateZapResponse.md)
 - [ZapsGetFilteredZapsResponse](docs/ZapsGetFilteredZapsResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
