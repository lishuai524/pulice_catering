package com.huayu.JC_HY_DD.reserve_tables_list.entity;

import java.io.Serializable;
import java.util.List;

public class DataMessage implements Serializable {
    public int code;
    public String msg;
    public int count;
    public List data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
