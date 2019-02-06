package com.wayknew.demo.order;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Order {
    private long orderId;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "product_id")
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "order_no")
    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "payment")
    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "payment_type")
    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "postage")
    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "payment_time")
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "send_time")
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "close_time")
    public Timestamp getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Timestamp closeTime) {
        this.closeTime = closeTime;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                userId == order.userId &&
                productId == order.productId &&
                Objects.equals(orderNo, order.orderNo) &&
                Objects.equals(payment, order.payment) &&
                Objects.equals(paymentType, order.paymentType) &&
                Objects.equals(postage, order.postage) &&
                Objects.equals(status, order.status) &&
                Objects.equals(paymentTime, order.paymentTime) &&
                Objects.equals(sendTime, order.sendTime) &&
                Objects.equals(endTime, order.endTime) &&
                Objects.equals(closeTime, order.closeTime) &&
                Objects.equals(createdAt, order.createdAt) &&
                Objects.equals(updatedAt, order.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, userId, productId, orderNo, payment, paymentType, postage, status, paymentTime, sendTime, endTime, closeTime, createdAt, updatedAt);
    }
}
