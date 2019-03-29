package com.learn.example.model;

import java.io.Serializable;

/**
 * @author jingjing.zhang
 */
public class RoutPlatformPayProduct implements Serializable {

    private static final long serialVersionUID = -834024416054498974L;

    private String id;

    private String platformId;

    private String payProductCode;

    private String payProductType;

    private String payChannel;

    private String bankId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getPayProductCode() {
        return payProductCode;
    }

    public void setPayProductCode(String payProductCode) {
        this.payProductCode = payProductCode == null ? null : payProductCode.trim();
    }

    public String getPayProductType() {
        return payProductType;
    }

    public void setPayProductType(String payProductType) {
        this.payProductType = payProductType == null ? null : payProductType.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }
}