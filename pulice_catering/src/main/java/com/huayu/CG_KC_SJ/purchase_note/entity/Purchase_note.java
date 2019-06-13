package com.huayu.CG_KC_SJ.purchase_note.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Purchase_note implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer state;

    private String serial_number;

    private String data;

    private Integer rmiid;

    private Integer kid;

    private String model;

    private Double quantity;

    private Integer uid;

    private Double total_prices;

    private String way;

    private String remark;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
        return "Purchase_note{" +
        "state=" + state +
        ", serial_number=" + serial_number +
        ", data=" + data +
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
