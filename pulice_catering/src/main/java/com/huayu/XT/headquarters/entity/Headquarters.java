package com.huayu.XT.headquarters.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-25
 */
public class Headquarters implements Serializable {

    private static final long serialVersionUID = 1L;

    private String manager;

    private String name;

    private String picture;

    private String business_hours;

    private String phone;

    private String email;

    private String site;

    private String qr_code;

    private String administrator;

    private String date_changed;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }
    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }
    public String getDate_changed() {
        return date_changed;
    }

    public void setDate_changed(String date_changed) {
        this.date_changed = date_changed;
    }

    @Override
    public String toString() {
        return "Headquarters{" +
        "manager=" + manager +
        ", name=" + name +
        ", picture=" + picture +
        ", business_hours=" + business_hours +
        ", phone=" + phone +
        ", email=" + email +
        ", site=" + site +
        ", qr_code=" + qr_code +
        ", administrator=" + administrator +
        ", date_changed=" + date_changed +
        "}";
    }
}
