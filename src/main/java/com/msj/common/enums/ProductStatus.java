package com.msj.common.enums;

public enum ProductStatus {
    LOWER(0, "下架"),
    SHELF(1, "上架");

    private Integer code;

    private String text;

    ProductStatus(Integer code, String text) {
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
