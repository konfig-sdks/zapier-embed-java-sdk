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
import com.konfigthis.client.model.ActionsListAvailableActionsdefaultResponse;
import com.konfigthis.client.model.AppsListPopularResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsApi
 */
@Disabled
public class AppsApiTest {

    private static AppsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AppsApi(apiClient);
    }

    /**
     * Get Apps
     *
     * This endpoint returns a list of popular apps.  Keep in mind that Zapier built-in apps will not be returned and the order of the result is by app popularity.  This endpoint requires the &#x60;zap&#x60; OAuth scope.  This API is rate limited by IP address (60 requests per min), or partner (150 requests per min), whichever occurs first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPopularTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String category = null;
        String query = null;
        String ids = null;
        AppsListPopularResponse response = api.listPopular()
                .limit(limit)
                .offset(offset)
                .category(category)
                .query(query)
                .ids(ids)
                .execute();
        // TODO: test validations
    }

}
