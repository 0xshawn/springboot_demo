package com.wayknew.demo.cart.request;

public class CartRequestDTO {
    private Long productId;
    private Long userId;
    private Integer selectedItemCount;
    private Integer totalPrice;
    private Integer realToalPrice;
    private Integer orderCount;
    private Integer selectOrderCount;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
}

