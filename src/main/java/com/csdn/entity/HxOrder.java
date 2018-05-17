package com.csdn.entity;

import java.io.Serializable;
import java.util.Date;

public class HxOrder implements Serializable {
    private String id;

    private String personId;

    private String exoertsId;

    private String serverItemId;

    private Date endDate;

    private Double price;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getExoertsId() {
        return exoertsId;
    }

    public void setExoertsId(String exoertsId) {
        this.exoertsId = exoertsId;
    }

    public String getServerItemId() {
        return serverItemId;
    }

    public void setServerItemId(String serverItemId) {
        this.serverItemId = serverItemId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}