package com.msj.common.enums;

/**
 * 收货地址状态
 */
public enum ReceivingAddressStatus {
    INEFFECTIVE(0, "无效"),
    EFFECTIVE(1, "有效");

    private Integer code;

    private String text;

    ReceivingAddressStatus(Integer code, String text) {
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
