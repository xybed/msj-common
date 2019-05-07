package com.msj.common.enums;

public enum ShoppingCartStatus {
    INEFFECTIVE(0, "无效"),
    EFFECTIVE(1, "有效"),
    ORDER(2, "下单");

    private Integer code;

    private String text;

    ShoppingCartStatus(Integer code, String text) {
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
