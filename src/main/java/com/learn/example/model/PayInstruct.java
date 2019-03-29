package com.learn.example.model;

import java.io.Serializable;

/**
 * @author jingjing.zhang
 */
public class PayInstruct implements Serializable {

    private static final long serialVersionUID = -7445610388900133361L;

    private String payInstructNo;

    private String payOrderNo;

    private String outTradeNo;

    private String appId;

    private String traceId;

    private String platformId;

    private String msUid;

    private String msOrg;

    private Integer payChannel;

    private Integer payProduct;

    private Integer payProductType;

    private String bank;

    private Integer amt;

    private String createTime;

    public String getPayInstructNo() {
        return payInstructNo;
    }

    public void setPayInstructNo(String payInstructNo) {
        this.payInstructNo = payInstructNo == null ? null : payInstructNo.trim();
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo == null ? null : payOrderNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId == null ? null : traceId.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getMsUid() {
        return msUid;
    }

    public void setMsUid(String msUid) {
        this.msUid = msUid == null ? null : msUid.trim();
    }

    public String getMsOrg() {
        return msOrg;
    }

    public void setMsOrg(String msOrg) {
        this.msOrg = msOrg == null ? null : msOrg.trim();
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getPayProduct() {
        return payProduct;
    }

    public void setPayProduct(Integer payProduct) {
        this.payProduct = payProduct;
    }

    public Integer getPayProductType() {
        return payProductType;
    }

    public void setPayProductType(Integer payProductType) {
        this.payProductType = payProductType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}