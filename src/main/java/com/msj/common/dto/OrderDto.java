package com.msj.common.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderDto {
    private Integer id;

    private String orderNumber;

    private ReceivingAddressDto receivingAddress;

    private List<ProductDto> products;

    private BigDecimal payAmount;

    private Integer status;

    private Date createTime;

    private Date payTime;

    private Date deliveryTime;

    private Date dealTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ReceivingAddressDto getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(ReceivingAddressDto receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
}
