package com.huayu.CG_KC_SJ.menu_statistics.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Menu_statistics implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sid;

    private Integer mmid;

    private Double time;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public Integer getMmid() {
        return mmid;
    }

    public void setMmid(Integer mmid) {
        this.mmid = mmid;
    }
    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Menu_statistics{" +
        "sid=" + sid +
        ", mmid=" + mmid +
        ", time=" + time +
        "}";
    }
}
