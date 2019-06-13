package com.huayu.CP_CW.prepaid_phone_list.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Prepaid_phone_list implements Serializable {

    private static final long serialVersionUID = 1L;

    private String account_number;

    private Integer hid;

    private Integer piid;

    private String phone;

    private String email;

    private String site;

    private Double money;

    private String time;

    private String expire;

    private Integer asid;

    private String remark;

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }
    public Integer getPiid() {
        return piid;
    }

    public void setPiid(Integer piid) {
        this.piid = piid;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }
    public Integer getAsid() {
        return asid;
    }

    public void setAsid(Integer asid) {
        this.asid = asid;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Prepaid_phone_list{" +
        "account_number=" + account_number +
        ", hid=" + hid +
        ", piid=" + piid +
        ", phone=" + phone +
        ", email=" + email +
        ", site=" + site +
        ", money=" + money +
        ", time=" + time +
        ", expire=" + expire +
        ", asid=" + asid +
        ", remark=" + remark +
        "}";
    }
}
