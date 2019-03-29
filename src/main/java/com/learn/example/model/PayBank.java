package com.learn.example.model;

import java.io.Serializable;

/**
 * @author jingjing.zhang
 */
public class PayBank implements Serializable {

    private static final long serialVersionUID = -8631849025595470628L;

    private String code;

    private String name;

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
}