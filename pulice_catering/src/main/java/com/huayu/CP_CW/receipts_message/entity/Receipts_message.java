package com.huayu.CP_CW.receipts_message.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Receipts_message implements Serializable {

    private static final long serialVersionUID = 1L;

    private String serial_number;

    private Double money;

    private String category;

    private String remark;

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Receipts_message{" +
        "serial_number=" + serial_number +
        ", money=" + money +
        ", category=" + category +
        ", remark=" + remark +
        "}";
    }
}
