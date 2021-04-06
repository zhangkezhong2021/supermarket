package com.zkz.result;

/**
 *
 */
public enum ResultCode {
    SUCCESS("200"),
    FAIL("400"), //失败
    UNAUTHORIZED("401"), //未认证（签名错误）
    NOT_FOUND("404"), //接口不存在
    INTERNAL_SERVER_ERROR("500");//服务器内部错误
    private final String code;

    ResultCode(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
