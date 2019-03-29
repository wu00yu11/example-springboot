package com.learn.example.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jingjing.zhang
 */
public class PayOrder  implements Serializable {

    private static final long serialVersionUID = 6528899559069137884L;

    private String payOrderNo;

    private String outTradeNo;

    private String appId;

    private String platformId;

    private String traceId;

    private String msUid;

    private String msOrg;

    private String merchantUidLt;

    private String goodLt;

    private Integer payType;

    private Integer accountAmt;

    private String payProduct;

    private Integer payProductAmt;

    private String bank;

    private Integer payAmt;

    private Integer refundingTotalAmt;

    private Integer refundedTotalAmt;

    private Date createTime;

    private Date updateTime;

    private Date payTime;

    private Date closeTime;

    private Integer payStatus;

    private Integer version;

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

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId == null ? null : traceId.trim();
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

    public String getMerchantUidLt() {
        return merchantUidLt;
    }

    public void setMerchantUidLt(String merchantUidLt) {
        this.merchantUidLt = merchantUidLt == null ? null : merchantUidLt.trim();
    }

    public String getGoodLt() {
        return goodLt;
    }

    public void setGoodLt(String goodLt) {
        this.goodLt = goodLt == null ? null : goodLt.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getAccountAmt() {
        return accountAmt;
    }

    public void setAccountAmt(Integer accountAmt) {
        this.accountAmt = accountAmt;
    }

    public String getPayProduct() {
        return payProduct;
    }

    public void setPayProduct(String payProduct) {
        this.payProduct = payProduct == null ? null : payProduct.trim();
    }

    public Integer getPayProductAmt() {
        return payProductAmt;
    }

    public void setPayProductAmt(Integer payProductAmt) {
        this.payProductAmt = payProductAmt;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Integer getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(Integer payAmt) {
        this.payAmt = payAmt;
    }

    public Integer getRefundingTotalAmt() {
        return refundingTotalAmt;
    }

    public void setRefundingTotalAmt(Integer refundingTotalAmt) {
        this.refundingTotalAmt = refundingTotalAmt;
    }

    public Integer getRefundedTotalAmt() {
        return refundedTotalAmt;
    }

    public void setRefundedTotalAmt(Integer refundedTotalAmt) {
        this.refundedTotalAmt = refundedTotalAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}