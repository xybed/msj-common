package com.msj.common.enums;

public enum PCategoryLevel {
    ONE(1),
    TWO(2),
    THREE(3);

    private Integer code;

    PCategoryLevel(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}
