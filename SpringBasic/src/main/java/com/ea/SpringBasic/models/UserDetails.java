package com.ea.SpringBasic.models;

public class UserDetails {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

