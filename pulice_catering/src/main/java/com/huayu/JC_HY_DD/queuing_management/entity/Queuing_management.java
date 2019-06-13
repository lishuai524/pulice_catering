package com.huayu.JC_HY_DD.queuing_management.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Queuing_management implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer queue_type;

    private String number;

    private String name;

    private Integer people;

    private String capacity;

    private Integer Desk_type;

    private String data;

    private Integer await_number;

    private String latency_time;

    private Integer qsid;

    private String remark;

    public Integer getQueue_type() {
        return queue_type;
    }

    public void setQueue_type(Integer queue_type) {
        this.queue_type = queue_type;
    }
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
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public Integer getDesk_type() {
        return Desk_type;
    }

    public void setDesk_type(Integer Desk_type) {
        this.Desk_type = Desk_type;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public Integer getAwait_number() {
        return await_number;
    }

    public void setAwait_number(Integer await_number) {
        this.await_number = await_number;
    }
    public String getLatency_time() {
        return latency_time;
    }

    public void setLatency_time(String latency_time) {
        this.latency_time = latency_time;
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
        return "Queuing_management{" +
        "queue_type=" + queue_type +
        ", number=" + number +
        ", name=" + name +
        ", people=" + people +
        ", capacity=" + capacity +
        ", Desk_type=" + Desk_type +
        ", data=" + data +
        ", await_number=" + await_number +
        ", latency_time=" + latency_time +
        ", qsid=" + qsid +
        ", remark=" + remark +
        "}";
    }
}
