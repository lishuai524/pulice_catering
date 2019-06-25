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

    private int id;

    private String shop_name;

    private String picture;

    private String manager;

    private String business_hours;

    private String phone;

    private String email;

    private String shop_site;

    private String ewmcode;

    private String update_data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
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

    public String getEwmcode() {
        return ewmcode;
    }

    public void setEwmcode(String ewmcode) {
        this.ewmcode = ewmcode;
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
        "sid=" + id +
        ", shop_name=" + shop_name +
        ", picture=" + picture +
        ", manager=" + manager +
        ", business_hours=" + business_hours +
        ", phone=" + phone +
        ", email=" + email +
        ", shop_site=" + shop_site +
        ", QR_code=" + ewmcode +
        ", update_data=" + update_data +
        "}";
    }
}
