/**
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.model;

import java.util.Map;

import com.bynder.sdk.api.BynderApi;
import com.google.gson.annotations.SerializedName;

/**
 * Usage model returned by {@link BynderApi#createUsage(Map)} and {@link BynderApi#getUsage(Map)}.
 */
public class Usage {

    /**
     * Usage id.
     */
    private String id;
    /**
     * Integration id.
     */
    @SerializedName(value = "integration_id")
    private String integrationId;
    /**
     * Asset id.
     */
    @SerializedName(value = "asset_id")
    private String assetId;
    /**
     * Integration information.
     */
    private Map<String, String> integration;
    /**
     * Timestamp of the asset usage creation.
     */
    private String timestamp;
    /**
     * URI with the location of the asset in the integration.
     */
    @SerializedName(value = "uri")
    private String location;
    /**
     * Additional information about the asset usage.
     */
    private String additional;

    public String getId() {
        return id;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public String getAssetId() {
        return assetId;
    }

    public Map<String, String> getIntegration() {
        return integration;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getLocation() {
        return location;
    }

    public String getAdditional() {
        return additional;
    }
}
