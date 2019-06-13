package com.huayu.CP_CW.food_list.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Food_list implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "flid", type = IdType.AUTO)
    private Integer flid;

    private String picture;

    private String name;

    private Integer fcid;

    private Integer rmiid;

    private Double quantity;

    private String unit;

    private String producer;

    private String phone;

    private Double unit_price;

    private String remark;

    private String time;

    public Integer getFlid() {
        return flid;
    }

    public void setFlid(Integer flid) {
        this.flid = flid;
    }
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getFcid() {
        return fcid;
    }

    public void setFcid(Integer fcid) {
        this.fcid = fcid;
    }
    public Integer getRmiid() {
        return rmiid;
    }

    public void setRmiid(Integer rmiid) {
        this.rmiid = rmiid;
    }
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Food_list{" +
        "flid=" + flid +
        ", picture=" + picture +
        ", name=" + name +
        ", fcid=" + fcid +
        ", rmiid=" + rmiid +
        ", quantity=" + quantity +
        ", unit=" + unit +
        ", producer=" + producer +
        ", phone=" + phone +
        ", unit_price=" + unit_price +
        ", remark=" + remark +
        ", time=" + time +
        "}";
    }
}
