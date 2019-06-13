package com.huayu.JC_HY_DD.state_of_tables.entity;

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
public class State_of_tables implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sotid", type = IdType.AUTO)
    private Integer sotid;

    private String name;

    public Integer getSotid() {
        return sotid;
    }

    public void setSotid(Integer sotid) {
        this.sotid = sotid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "State_of_tables{" +
        "sotid=" + sotid +
        ", name=" + name +
        "}";
    }
}
