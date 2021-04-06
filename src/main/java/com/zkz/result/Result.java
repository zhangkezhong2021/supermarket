package com.zkz.result;

import com.alibaba.fastjson.JSON;

/***
 *
 */
public class Result {
    private String code;
    private String msg;


    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
