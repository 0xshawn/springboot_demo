package com.wayknew.demo.cart;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Cart {
    private long cartId;
    private long userId;
    private long productId;
    private Integer selectedItemCount;
    private Integer totalPrice;
    private Integer realToalPrice;
    private Integer orderCount;
    private Integer selectOrderCount;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
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
    @Column(name = "selected_item_count")
    public Integer getSelectedItemCount() {
        return selectedItemCount;
    }

    public void setSelectedItemCount(Integer selectedItemCount) {
        this.selectedItemCount = selectedItemCount;
    }

    @Basic
    @Column(name = "total_price")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "real_toal_price")
    public Integer getRealToalPrice() {
        return realToalPrice;
    }

    public void setRealToalPrice(Integer realToalPrice) {
        this.realToalPrice = realToalPrice;
    }

    @Basic
    @Column(name = "order_count")
    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    @Basic
    @Column(name = "select_order_count")
    public Integer getSelectOrderCount() {
        return selectOrderCount;
    }

    public void setSelectOrderCount(Integer selectOrderCount) {
        this.selectOrderCount = selectOrderCount;
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
        Cart cart = (Cart) o;
        return cartId == cart.cartId &&
                userId == cart.userId &&
                productId == cart.productId &&
                Objects.equals(selectedItemCount, cart.selectedItemCount) &&
                Objects.equals(totalPrice, cart.totalPrice) &&
                Objects.equals(realToalPrice, cart.realToalPrice) &&
                Objects.equals(orderCount, cart.orderCount) &&
                Objects.equals(selectOrderCount, cart.selectOrderCount) &&
                Objects.equals(createdAt, cart.createdAt) &&
                Objects.equals(updatedAt, cart.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartId, userId, productId, selectedItemCount, totalPrice, realToalPrice, orderCount, selectOrderCount, createdAt, updatedAt);
    }
}
