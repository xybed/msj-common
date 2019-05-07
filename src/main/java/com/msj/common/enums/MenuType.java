package com.msj.common.enums;

public enum MenuType {
    MENU(0, "菜单"),
    BUTTON(1, "按钮");

    private Integer code;

    private String text;

    MenuType(Integer code, String text) {
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
