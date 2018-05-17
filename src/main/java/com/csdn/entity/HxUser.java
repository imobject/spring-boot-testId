package com.csdn.entity;

import java.io.Serializable;

public class HxUser implements Serializable {
    private String id;

    private String name;

    private String password;

    private String isSuccess;

    private String img;

    private String isExperts;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIsExperts() {
        return isExperts;
    }

    public void setIsExperts(String isExperts) {
        this.isExperts = isExperts;
    }
}