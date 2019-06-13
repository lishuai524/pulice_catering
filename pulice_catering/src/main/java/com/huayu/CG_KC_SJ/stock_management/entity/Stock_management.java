package com.huayu.CG_KC_SJ.stock_management.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Stock_management implements Serializable {

    private static final long serialVersionUID = 1L;

    private String odd;

    private String data;

    private Integer rmiid;

    private Integer kid;

    private Integer uni_uid;

    private String model;

    private Double unit_price;

    private Integer unit;

    private Double uid;

    private Double total_prices;

    private String remark;

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
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
    public Integer getUni_uid() {
        return uni_uid;
    }

    public void setUni_uid(Integer uni_uid) {
        this.uni_uid = uni_uid;
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
    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }
    public Double getUid() {
        return uid;
    }

    public void setUid(Double uid) {
        this.uid = uid;
    }
    public Double getTotal_prices() {
        return total_prices;
    }

    public void setTotal_prices(Double total_prices) {
        this.total_prices = total_prices;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Stock_management{" +
        "odd=" + odd +
        ", data=" + data +
        ", rmiid=" + rmiid +
        ", kid=" + kid +
        ", uni_uid=" + uni_uid +
        ", model=" + model +
        ", unit_price=" + unit_price +
        ", unit=" + unit +
        ", uid=" + uid +
        ", total_prices=" + total_prices +
        ", remark=" + remark +
        "}";
    }
}
