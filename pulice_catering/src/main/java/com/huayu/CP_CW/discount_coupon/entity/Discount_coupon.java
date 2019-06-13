package com.huayu.CP_CW.discount_coupon.entity;

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
public class Discount_coupon implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dcid", type = IdType.AUTO)
    private Integer dcid;

    private String name;

    private String code;

    private Double money;

    private String conditionc;

    private String start_time;

    private String end_time;

    private String remark;

    private String scope;

    public Integer getDcid() {
        return dcid;
    }

    public void setDcid(Integer dcid) {
        this.dcid = dcid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
    public String getConditionc() {
        return conditionc;
    }

    public void setConditionc(String conditionc) {
        this.conditionc = conditionc;
    }
    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "Discount_coupon{" +
        "dcid=" + dcid +
        ", name=" + name +
        ", code=" + code +
        ", money=" + money +
        ", conditionc=" + conditionc +
        ", start_time=" + start_time +
        ", end_time=" + end_time +
        ", remark=" + remark +
        ", scope=" + scope +
        "}";
    }
}
