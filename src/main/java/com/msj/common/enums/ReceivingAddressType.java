package com.msj.common.enums;

/**
 * 收货地址类型
 */
public enum ReceivingAddressType {
    COMMON(0, "普通"),
    DEFAULT(1, "默认");

    private Integer code;

    private String text;

    ReceivingAddressType(Integer code, String text) {
        this.code = code;
        this.text = text;
    }

    public Integer getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

}
