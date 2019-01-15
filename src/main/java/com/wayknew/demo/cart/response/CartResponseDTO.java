package com.wayknew.demo.cart.response;

import com.wayknew.demo.cart.CartDTO;

import java.util.List;

public class CartResponseDTO {
    private Integer code;
    private String message;
    private CartDTO cart;
    private List<CartDTO> carts;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CartDTO getCart() {
        return cart;
    }

    public void setCart(CartDTO cart) {
        this.cart = cart;
    }

    public List<CartDTO> getCarts() {
        return carts;
    }

    public void setCarts(List<CartDTO> carts) {
        this.carts = carts;
    }
}
