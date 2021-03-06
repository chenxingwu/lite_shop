package com.ohayou.liteshop.response;

import org.springframework.validation.BindException;

/**
 * @author liyan
 * @date 2020/7/13 下午8:08
 */
/*
错误状态码枚举

 */
public enum ErrorCodeMsg {

    SERVER_ERROR(99999,"系统异常"),
    UNAUTHENTICATED_CODE(400200),
    UNAUTHENTICATED_ERROR(400201,"认证失败，用户名或密码有误"),
    USER_NOT_ENABLED_ERROR(400202,"认证失败，该账号不可用"),
    INVALID_TOKEN(400203,"无效的token,拒绝访问"),
    TOKEN_EXPIRED(400204,"token已过期，请重新登录"),
    ACCESS_DENIED_ERROR(400300,"权限不足，拒绝访问"),
    PARAMETER_VALIDATED_ERROR(400101);

    private int code;

    private String msg;

    ErrorCodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    ErrorCodeMsg(int code){
        this.code = code;
    }


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
}
