package com.msj.common.enums;

public enum Sex {

    UNKNOW(0, "未知"),
    MALE(1, "男"),
    FEMALE(2, "女");

    private Integer code;
    private String text;

    Sex(Integer code, String text){
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
