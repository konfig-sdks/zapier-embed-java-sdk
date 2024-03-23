package com.konfigthis.client;

import com.konfigthis.client.api.ActionsApi;
import com.konfigthis.client.api.AppsApi;
import com.konfigthis.client.api.AuthenticationsApi;
import com.konfigthis.client.api.ExperimentalApi;
import com.konfigthis.client.api.ZapsApi;

public class ZapierEmbed {
    private ApiClient apiClient;
    public final ActionsApi actions;
    public final AppsApi apps;
    public final AuthenticationsApi authentications;
    public final ExperimentalApi experimental;
    public final ZapsApi zaps;

    public ZapierEmbed() {
        this(null);
    }

    public ZapierEmbed(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.actions = new ActionsApi(this.apiClient);
        this.apps = new AppsApi(this.apiClient);
        this.authentications = new AuthenticationsApi(this.apiClient);
        this.experimental = new ExperimentalApi(this.apiClient);
        this.zaps = new ZapsApi(this.apiClient);
    }

}
