package com.huayu.CP_CW.food_category.entity;

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
public class Food_category implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fcid", type = IdType.AUTO)
    private Integer fcid;

    private String name;

    public Integer getFcid() {
        return fcid;
    }

    public void setFcid(Integer fcid) {
        this.fcid = fcid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food_category{" +
        "fcid=" + fcid +
        ", name=" + name +
        "}";
    }
}
