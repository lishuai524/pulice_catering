package com.huayu.CG_KC_SJ.procurement_plan.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Procurement_plan implements Serializable {

    private static final long serialVersionUID = 1L;

    private String time;

    private Integer rmiid;

    private Integer kid;

    private Double unit_price;

    private Integer uid;

    private Double inventory;

    private Double suggest;

    private Double plan;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public Integer getRmiid() {
        return rmiid;
    }

    public void setRmiid(Integer rmiid) {
        this.rmiid = rmiid;
    }
    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }
    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Double getInventory() {
        return inventory;
    }

    public void setInventory(Double inventory) {
        this.inventory = inventory;
    }
    public Double getSuggest() {
        return suggest;
    }

    public void setSuggest(Double suggest) {
        this.suggest = suggest;
    }
    public Double getPlan() {
        return plan;
    }

    public void setPlan(Double plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Procurement_plan{" +
        "time=" + time +
        ", rmiid=" + rmiid +
        ", kid=" + kid +
        ", unit_price=" + unit_price +
        ", uid=" + uid +
        ", inventory=" + inventory +
        ", suggest=" + suggest +
        ", plan=" + plan +
        "}";
    }
}
