package com.huayu.JC_HY_DD.stores_information.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Stores_information implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sid;

    private String shop_name;

    private String picture;

    private Integer manager;

    private String business_hours;

    private String phone;

    private String email;

    private String shop_site;

    private String QR_code;

    private String update_data;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }
    public String getBusiness_hours() {
        return business_hours;
    }

    public void setBusiness_hours(String business_hours) {
        this.business_hours = business_hours;
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
    public String getShop_site() {
        return shop_site;
    }

    public void setShop_site(String shop_site) {
        this.shop_site = shop_site;
    }
    public String getQR_code() {
        return QR_code;
    }

    public void setQR_code(String QR_code) {
        this.QR_code = QR_code;
    }
    public String getUpdate_data() {
        return update_data;
    }

    public void setUpdate_data(String update_data) {
        this.update_data = update_data;
    }

    @Override
    public String toString() {
        return "Stores_information{" +
        "sid=" + sid +
        ", shop_name=" + shop_name +
        ", picture=" + picture +
        ", manager=" + manager +
        ", business_hours=" + business_hours +
        ", phone=" + phone +
        ", email=" + email +
        ", shop_site=" + shop_site +
        ", QR_code=" + QR_code +
        ", update_data=" + update_data +
        "}";
    }
}
