package com.learn.example.model;

import java.io.Serializable;

/**
 * @author jingjing.zhang
 */
public class PayProduct implements Serializable {

    private static final long serialVersionUID = 3642244029721179987L;

    private Integer id;

    private String code;

    private String name;

    private Integer type;

    private String payChannel;

    private Integer taxRate;

    private Integer terminal;

    private Integer isRelatedBank;

    private Integer status;

    private Integer priority;

    private String bankLt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Integer getIsRelatedBank() {
        return isRelatedBank;
    }

    public void setIsRelatedBank(Integer isRelatedBank) {
        this.isRelatedBank = isRelatedBank;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getBankLt() {
        return bankLt;
    }

    public void setBankLt(String bankLt) {
        this.bankLt = bankLt == null ? null : bankLt.trim();
    }
}