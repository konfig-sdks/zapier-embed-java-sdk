/*
 * Zapier Embed API
 * The Zapier Embed API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@zapier.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ActionsGetChoicesRequest;
import com.konfigthis.client.model.ActionsGetChoicesRequestData;
import com.konfigthis.client.model.ActionsGetChoicesResponse;
import com.konfigthis.client.model.ActionsGetInputFieldsRequest;
import com.konfigthis.client.model.ActionsGetInputFieldsResponse;
import com.konfigthis.client.model.ActionsGetOutputFieldsRequest;
import com.konfigthis.client.model.ActionsGetOutputFieldsResponse;
import com.konfigthis.client.model.ActionsListAvailableActionsResponse;
import com.konfigthis.client.model.ActionsListAvailableActionsdefaultResponse;
import com.konfigthis.client.model.ActionsTestActionExecution200Response;
import com.konfigthis.client.model.ActionsTestActionExecutionRequest;
import com.konfigthis.client.model.ActionsTestActionExecutionResponse;
import com.konfigthis.client.model.InputsWithAuthenticationId;
import com.konfigthis.client.model.InputsWithAuthenticationIdAndFetchLiveSamples;
import com.konfigthis.client.model.InputsWithAuthenticationIdNoPage;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActionsApi
 */
@Disabled
public class ActionsApiTest {

    private static ActionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ActionsApi(apiClient);
    }

    /**
     * Get Choices
     *
     * Get the possible values for an Input Field that is marked as &#x60;SELECT&#x60;.  This endpoint requires the &#x60;zap&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChoicesTest() throws ApiException {
        ActionsGetChoicesRequestData data = null;
        String action = null;
        String input = null;
        String page = null;
        ActionsGetChoicesResponse response = api.getChoices(data, action, input)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Input Fields
     *
     * Get the Input Fields for a particular Action, using the provided authentication and inputs.  This endpoint requires the &#x60;zap:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInputFieldsTest() throws ApiException {
        String action = null;
        InputsWithAuthenticationId data = null;
        ActionsGetInputFieldsResponse response = api.getInputFields(action)
                .data(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Output Fields
     *
     * Get the Output Fields for a particular Action, using the provided authentication and inputs.  This endpoint requires the &#x60;zap:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOutputFieldsTest() throws ApiException {
        String action = null;
        InputsWithAuthenticationIdAndFetchLiveSamples data = null;
        ActionsGetOutputFieldsResponse response = api.getOutputFields(action)
                .data(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Actions
     *
     * Fetch the available actions for the provided App. It&#39;s typical to filter by type so that only actions that make sense for a particular step are shown. For example only showing reads for the first step in a Zap.  This endpoint requires the &#x60;zap&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAvailableActionsTest() throws ApiException {
        UUID app = null;
        String actionType = null;
        ActionsListAvailableActionsResponse response = api.listAvailableActions(app, actionType)
                .execute();
        // TODO: test validations
    }

    /**
     * Test an action (step)
     *
     * Tests the action (step) in the third party api, using the provided authentication and inputs. On a successful test returns 200 and the result of executing the action, otherwise it returns a 400 and details about the failure.  This endpoint requires the &#x60;zap:write&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testActionExecutionTest() throws ApiException {
        String action = null;
        InputsWithAuthenticationIdNoPage data = null;
        ActionsTestActionExecutionResponse response = api.testActionExecution(action)
                .data(data)
                .execute();
        // TODO: test validations
    }

}
