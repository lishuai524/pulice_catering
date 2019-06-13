package com.huayu.JC_HY_DD.information_desk.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Information_desk implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ldid;

    private String number;

    private String name;

    private String capacity;

    private String type;

    private String location;

    private Integer sotid;

    public Integer getLdid() {
        return ldid;
    }

    public void setLdid(Integer ldid) {
        this.ldid = ldid;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Integer getSotid() {
        return sotid;
    }

    public void setSotid(Integer sotid) {
        this.sotid = sotid;
    }

    @Override
    public String toString() {
        return "Information_desk{" +
        "ldid=" + ldid +
        ", number=" + number +
        ", name=" + name +
        ", capacity=" + capacity +
        ", type=" + type +
        ", location=" + location +
        ", sotid=" + sotid +
        "}";
    }
}
