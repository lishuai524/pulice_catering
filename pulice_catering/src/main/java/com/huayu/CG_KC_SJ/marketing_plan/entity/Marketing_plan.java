package com.huayu.CG_KC_SJ.marketing_plan.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Marketing_plan implements Serializable {

    private static final long serialVersionUID = 1L;

    private String time_frame;

    private Integer shop;

    private Integer cuisine;

    private Integer category;

    private Double afternoon_session;

    private Double lateness_session;

    private Double festival_afternoon_session;

    private Double festival_lateness_session;

    public String getTime_frame() {
        return time_frame;
    }

    public void setTime_frame(String time_frame) {
        this.time_frame = time_frame;
    }
    public Integer getShop() {
        return shop;
    }

    public void setShop(Integer shop) {
        this.shop = shop;
    }
    public Integer getCuisine() {
        return cuisine;
    }

    public void setCuisine(Integer cuisine) {
        this.cuisine = cuisine;
    }
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
    public Double getAfternoon_session() {
        return afternoon_session;
    }

    public void setAfternoon_session(Double afternoon_session) {
        this.afternoon_session = afternoon_session;
    }
    public Double getLateness_session() {
        return lateness_session;
    }

    public void setLateness_session(Double lateness_session) {
        this.lateness_session = lateness_session;
    }
    public Double getFestival_afternoon_session() {
        return festival_afternoon_session;
    }

    public void setFestival_afternoon_session(Double festival_afternoon_session) {
        this.festival_afternoon_session = festival_afternoon_session;
    }
    public Double getFestival_lateness_session() {
        return festival_lateness_session;
    }

    public void setFestival_lateness_session(Double festival_lateness_session) {
        this.festival_lateness_session = festival_lateness_session;
    }

    @Override
    public String toString() {
        return "Marketing_plan{" +
        "time_frame=" + time_frame +
        ", shop=" + shop +
        ", cuisine=" + cuisine +
        ", category=" + category +
        ", afternoon_session=" + afternoon_session +
        ", lateness_session=" + lateness_session +
        ", festival_afternoon_session=" + festival_afternoon_session +
        ", festival_lateness_session=" + festival_lateness_session +
        "}";
    }
}
