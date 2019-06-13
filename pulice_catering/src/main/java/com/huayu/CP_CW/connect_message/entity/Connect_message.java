package com.huayu.CP_CW.connect_message.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
public class Connect_message implements Serializable {

    private static final long serialVersionUID = 1L;

    private String time;

    private String way;

    private Double gathering;

    private Double practical_gathering;

    private String heir;

    private String accepter;

    private String Handover_date;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
    public Double getGathering() {
        return gathering;
    }

    public void setGathering(Double gathering) {
        this.gathering = gathering;
    }
    public Double getPractical_gathering() {
        return practical_gathering;
    }

    public void setPractical_gathering(Double practical_gathering) {
        this.practical_gathering = practical_gathering;
    }
    public String getHeir() {
        return heir;
    }

    public void setHeir(String heir) {
        this.heir = heir;
    }
    public String getAccepter() {
        return accepter;
    }

    public void setAccepter(String accepter) {
        this.accepter = accepter;
    }
    public String getHandover_date() {
        return Handover_date;
    }

    public void setHandover_date(String Handover_date) {
        this.Handover_date = Handover_date;
    }

    @Override
    public String toString() {
        return "Connect_message{" +
        "time=" + time +
        ", way=" + way +
        ", gathering=" + gathering +
        ", practical_gathering=" + practical_gathering +
        ", heir=" + heir +
        ", accepter=" + accepter +
        ", Handover_date=" + Handover_date +
        "}";
    }
}
