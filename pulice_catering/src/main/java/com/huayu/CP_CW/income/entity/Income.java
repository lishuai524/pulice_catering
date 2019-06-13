package com.huayu.CP_CW.income.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Income implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Double money;

    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Income{" +
        "name=" + name +
        ", money=" + money +
        ", remark=" + remark +
        "}";
    }
}
