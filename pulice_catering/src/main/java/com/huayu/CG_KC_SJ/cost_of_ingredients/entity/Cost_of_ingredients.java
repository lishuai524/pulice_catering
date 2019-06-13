package com.huayu.CG_KC_SJ.cost_of_ingredients.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Cost_of_ingredients implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sid;

    private String starting_time;

    private String deadline;

    private Integer rmiid;

    private Double cost;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public String getStarting_time() {
        return starting_time;
    }

    public void setStarting_time(String starting_time) {
        this.starting_time = starting_time;
    }
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public Integer getRmiid() {
        return rmiid;
    }

    public void setRmiid(Integer rmiid) {
        this.rmiid = rmiid;
    }
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Cost_of_ingredients{" +
        "sid=" + sid +
        ", starting_time=" + starting_time +
        ", deadline=" + deadline +
        ", rmiid=" + rmiid +
        ", cost=" + cost +
        "}";
    }
}
