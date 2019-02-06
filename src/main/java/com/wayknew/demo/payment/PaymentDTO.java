package com.wayknew.demo.payment;

import com.alibaba.fastjson.annotation.JSONField;

import java.sql.Timestamp;

public class PaymentDTO {
    private long payId;
    private Byte type;
    private Integer amount;
    private Byte status;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Timestamp createdAt;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Timestamp updatedAt;


    public long getPayId() {
        return payId;
    }

    public void setPayId(long payId) {
        this.payId = payId;
    }


    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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