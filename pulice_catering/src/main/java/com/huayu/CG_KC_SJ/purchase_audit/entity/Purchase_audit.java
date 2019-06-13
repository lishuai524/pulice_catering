package com.huayu.CG_KC_SJ.purchase_audit.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Purchase_audit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer serial_number;

    private String time;

    private Integer rmiid;

    private Integer kid;

    private String model;

    private Double quantity;

    private Integer uid;

    private Double total_prices;

    private String way;

    private String remark;

    public Integer getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(Integer serial_number) {
        this.serial_number = serial_number;
    }
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
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Double getTotal_prices() {
        return total_prices;
    }

    public void setTotal_prices(Double total_prices) {
        this.total_prices = total_prices;
    }
    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Purchase_audit{" +
        "serial_number=" + serial_number +
        ", time=" + time +
        ", rmiid=" + rmiid +
        ", kid=" + kid +
        ", model=" + model +
        ", quantity=" + quantity +
        ", uid=" + uid +
        ", total_prices=" + total_prices +
        ", way=" + way +
        ", remark=" + remark +
        "}";
    }
}
