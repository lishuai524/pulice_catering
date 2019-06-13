package com.huayu.CP_CW.closing_the_list.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Closing_the_list implements Serializable {

    private static final long serialVersionUID = 1L;

    private String this_time;

    private String last_time;

    private String number;

    private String connect;

    private String reception;

    private String remark;

    public String getThis_time() {
        return this_time;
    }

    public void setThis_time(String this_time) {
        this.this_time = this_time;
    }
    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }
    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Closing_the_list{" +
        "this_time=" + this_time +
        ", last_time=" + last_time +
        ", number=" + number +
        ", connect=" + connect +
        ", reception=" + reception +
        ", remark=" + remark +
        "}";
    }
}
