/**
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.query;

/**
 * Query with the information to save a media asset.
 */
public class SaveMediaQuery {

    /**
     * Import id of a finalised and processed upload to save.
     */
    @ApiField(name = "importId")
    private String importId;

    /**
     * Brand id to save the media asset to.
     */
    @ApiField(name = "brandId")
    private String brandId;

    /**
     * Name of the media asset.
     */
    @ApiField(name = "name")
    private String name;

    /**
     * Media id for which to save the new version.
     */
    @ApiField(name = "id")
    private String mediaId;
    /**
     *  Flags if the media asset should be sent to the waiting room.
     */
    @ApiField(name = "audit")
    private Boolean audit;

    public SaveMediaQuery(final String importId) {
        this.importId = importId;
    }

    public String getImportId() {
        return importId;
    }

    public String getBrandId() {
        return brandId;
    }

    public SaveMediaQuery setBrandId(final String brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getName() {
        return name;
    }

    public SaveMediaQuery setName(final String name) {
        this.name = name;
        return this;
    }

    public String getMediaId() {
        return mediaId;
    }

    public SaveMediaQuery setMediaId(final String mediaId) {
        this.mediaId = mediaId;
        return this;
    }

    public SaveMediaQuery setAudit(final Boolean audit) {
        this.audit = audit;
        return this;
    }
}
