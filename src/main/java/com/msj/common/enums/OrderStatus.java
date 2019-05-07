package com.msj.common.enums;

/**
 * 订单状态
 */
public enum OrderStatus {
    WAIT_PAY(0, "待付款"),
    WAIT_SEND(1, "待发货"),
    WAIT_DELIVERY(2, "待收货"),
    WAIT_COMMENT(3, "待评价"),
    REFUND(4, "退款"),
    SUCCESS(5, "交易成功"),
    FAIL(6, "交易失败"),
    DELETE(7, "删除");

    private Integer code;

    private String text;

    OrderStatus(Integer code, String text) {
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
