package com.huayu.JC_HY_DD.reserve_tables_list.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Reserve_tables_list implements Serializable {

    private static final long serialVersionUID = 1L;

    private String number;

    private String name;

    private Integer people;

    private String reserved;

    private String order_date;

    private String scheduled_time;

    private Integer qsid;

    private String remark;

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
    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }
    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }
    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }
    public String getScheduled_time() {
        return scheduled_time;
    }

    public void setScheduled_time(String scheduled_time) {
        this.scheduled_time = scheduled_time;
    }
    public Integer getQsid() {
        return qsid;
    }

    public void setQsid(Integer qsid) {
        this.qsid = qsid;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Reserve_tables_list{" +
        "number=" + number +
        ", name=" + name +
        ", people=" + people +
        ", reserved=" + reserved +
        ", order_date=" + order_date +
        ", scheduled_time=" + scheduled_time +
        ", qsid=" + qsid +
        ", remark=" + remark +
        "}";
    }
}
