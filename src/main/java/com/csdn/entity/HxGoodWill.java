package com.csdn.entity;

import java.io.Serializable;

public class HxGoodWill implements Serializable {
    private String id;

    private String fromUser;

    private String toUser;

    private String orderId;

    private String isSuccess;

    private String payType;

    private Double price;

    private Integer goodWillItemId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getGoodWillItemId() {
        return goodWillItemId;
    }

    public void setGoodWillItemId(Integer goodWillItemId) {
        this.goodWillItemId = goodWillItemId;
    }
}