package com.huayu.CP_CW.menu_management.entity;

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
public class Menu_management implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "mmid", type = IdType.AUTO)
    private Integer mmid;

    private Integer flid;

    private String picture;

    private Integer sid;

    private String remark;

    private String creation_time;

    public Integer getMmid() {
        return mmid;
    }

    public void setMmid(Integer mmid) {
        this.mmid = mmid;
    }
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
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(String creation_time) {
        this.creation_time = creation_time;
    }

    @Override
    public String toString() {
        return "Menu_management{" +
        "mmid=" + mmid +
        ", flid=" + flid +
        ", picture=" + picture +
        ", sid=" + sid +
        ", remark=" + remark +
        ", creation_time=" + creation_time +
        "}";
    }
}
