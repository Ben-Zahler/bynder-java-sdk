/**
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.query;

/**
 * Query used internally to login.
 */
public class LoginQuery {

    /**
     * Username.
     */
    @ApiField(name = "username")
    private String username;
    /**
     * Password.
     */
    @ApiField(name = "password")
    private String password;

    public LoginQuery(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
