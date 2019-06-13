package com.huayu.CP_CW.promotion.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Promotion implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String cla;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCla() {
        return cla;
    }

    public void setClass(String cla) {
        this.cla = cla;
    }

    @Override
    public String toString() {
        return "Promotion{" +
        "name=" + name +
        ", class=" + cla +
        "}";
    }
}
