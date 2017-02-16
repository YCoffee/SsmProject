package com.gdyx.app.web.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/16.
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
