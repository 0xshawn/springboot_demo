package com.wayknew.demo.cart;

import com.alibaba.fastjson.annotation.JSONField;

import java.sql.Timestamp;

public class CartDTO {
    private long cartId;
    private Integer selectedItemCount;
    private Integer totalPrice;
    private Integer realToalPrice;
    private Integer orderCount;
    private Integer selectOrderCount;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Timestamp createdAt;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Timestamp updatedAt;

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public Integer getSelectedItemCount() {
        return selectedItemCount;
    }

    public void setSelectedItemCount(Integer selectedItemCount) {
        this.selectedItemCount = selectedItemCount;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getRealToalPrice() {
        return realToalPrice;
    }

    public void setRealToalPrice(Integer realToalPrice) {
        this.realToalPrice = realToalPrice;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getSelectOrderCount() {
        return selectOrderCount;
    }

    public void setSelectOrderCount(Integer selectOrderCount) {
        this.selectOrderCount = selectOrderCount;
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
