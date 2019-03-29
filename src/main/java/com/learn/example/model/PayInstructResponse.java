package com.learn.example.model;

import java.io.Serializable;

/**
 * @author jingjing.zhang
 */
public class PayInstructResponse implements Serializable {

    private static final long serialVersionUID = 6400311920398059369L;

    private String payInstructNo;

    private String outInstructNo;

    private Integer amt;

    private String responseCode;

    private String responseMsg;

    private String createTime;

    public String getPayInstructNo() {
        return payInstructNo;
    }

    public void setPayInstructNo(String payInstructNo) {
        this.payInstructNo = payInstructNo == null ? null : payInstructNo.trim();
    }

    public String getOutInstructNo() {
        return outInstructNo;
    }

    public void setOutInstructNo(String outInstructNo) {
        this.outInstructNo = outInstructNo == null ? null : outInstructNo.trim();
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode == null ? null : responseCode.trim();
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg == null ? null : responseMsg.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}