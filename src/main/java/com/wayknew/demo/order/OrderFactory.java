package com.wayknew.demo.order;

import com.sun.javafx.scene.control.skin.IntegerFieldSkin;
import com.wayknew.demo.order.response.OrderResponseDTO;


import java.util.ArrayList;
import java.util.List;

public class OrderFactory {

    static OrderDTO toOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setOrderId(order.getOrderId());
        orderDTO.setUserId(order.getUserId());
        orderDTO.setProductId(order.getProductId());
        orderDTO.setCloseTime(order.getCloseTime());
        orderDTO.setEndTime(order.getEndTime());
        orderDTO.setOrderNo(order.getOrderNo());
        orderDTO.setPayment(order.getPayment());
        orderDTO.setPaymentTime(order.getPaymentTime());
        orderDTO.setPostage(order.getPostage());
        orderDTO.setSendTime(order.getSendTime());
        orderDTO.setPaymentType(order.getPaymentType());
        orderDTO.setStatus(order.getStatus());
        orderDTO.setCreatedAt(order.getCreatedAt());
        orderDTO.setUpdatedAt(order.getUpdatedAt());
        return orderDTO;
    }

    static OrderResponseDTO successResponse(){
        OrderResponseDTO res = new OrderResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;

    }



    static OrderResponseDTO successResponse(Order order){
        OrderDTO orderDTO = toOrderDTO(order);
        OrderResponseDTO res = new OrderResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setOrder(orderDTO);
        return res;
    }

    static OrderResponseDTO successResponse(List<Order> orders){
        List<OrderDTO> orderDTOList = new ArrayList<>();
        orders.forEach(order -> {
            orderDTOList.add(toOrderDTO(order));
        });
            OrderResponseDTO res = new OrderResponseDTO();
            res.setCode(0);
            res.setMessage("success");
            res.setOrders(orderDTOList);
            return res;
    }

        static OrderResponseDTO errorResponse(Integer code, String message){
        OrderResponseDTO res = new OrderResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;

        }




}
