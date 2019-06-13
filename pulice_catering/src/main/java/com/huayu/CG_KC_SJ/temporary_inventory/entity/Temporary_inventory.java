package com.huayu.CG_KC_SJ.temporary_inventory.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Temporary_inventory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sid;

    private Integer rmiid;

    private Integer kid;

    private String model;

    private Double unit_price;

    private Integer uid;

    private Double quantity;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Temporary_inventory{" +
        "sid=" + sid +
        ", rmiid=" + rmiid +
        ", kid=" + kid +
        ", model=" + model +
        ", unit_price=" + unit_price +
        ", uid=" + uid +
        ", quantity=" + quantity +
        "}";
    }
}
