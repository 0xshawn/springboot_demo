package com.wayknew.demo.order.response;

import com.wayknew.demo.order.OrderDTO;

import java.util.List;

public class OrderListResponseDTO {
    private Integer code;
    private String message;
    private List<OrderDTO> orders;

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

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }
}
