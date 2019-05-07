package com.msj.common.enums;

/**
 * 后台用户锁住状态
 */
public enum LockedStatus {
    UNLOCKED(0, "未锁住"),
    LOCKED(1, "锁住");

    private Integer code;

    private String text;

    LockedStatus(Integer code, String text) {
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
