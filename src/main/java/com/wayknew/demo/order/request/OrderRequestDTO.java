package com.wayknew.demo.order.request;


import java.sql.Timestamp;

public class OrderRequestDTO {

    private long userId;
    private long productId;
    private Long orderNo;
    private Integer payment;
    private Integer paymentType;
    private Integer postage;
    private Integer status;
    private Timestamp paymentTime;
    private Timestamp sendTime;
    private Timestamp endTime;
    private Timestamp closeTime;
    private Timestamp createdAt;
    private Timestamp updatedAt;



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }


    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }


    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }


    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }


    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }


    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }


    public Timestamp getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Timestamp closeTime) {
        this.closeTime = closeTime;
    }


    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }


    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
