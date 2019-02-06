package com.wayknew.demo.order;

import com.wayknew.demo.order.request.OrderRequestDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;


@Service
public class OrderBO {



    @Resource
    private OrderDAO orderDAO;


    Order  create(long userId, long productId, Long orderNo, Integer payment, Integer paymentType, Integer postage, Integer status, Timestamp paymentTime,Timestamp sendTime,Timestamp endTime,Timestamp closeTime){
        Order order = new Order();
        order.setUserId(userId);
        order.setProductId(productId);
        order.setOrderNo(orderNo);
        order.setPayment(payment);
        order.setPaymentType(paymentType);
        order.setPostage(postage);
        order.setStatus(status);
        order.setPaymentTime(paymentTime);
        order.setSendTime(sendTime);
        order.setEndTime(endTime);
        order.setCloseTime(closeTime);

        return orderDAO.save(order);
    }

    Order getById(Long orderId) {
        return orderDAO.findByOrderId(orderId);
    }

    List<Order> getOrderList() {
        return orderDAO.findAll();
    }

    Order updateOrder(Long orderId, OrderRequestDTO body){
        Order order = orderDAO.findByOrderId(orderId);

        if(body.getCloseTime() != null){
            order.setCloseTime(body.getCloseTime());
        }
        if(body.getEndTime() != null){
            order.setEndTime(body.getEndTime());
        }
        if(body.getOrderNo() != null){
            order.setOrderNo(body.getOrderNo());
        }
        if(body.getPayment()!=null){
            order.setPayment(body.getPayment());
        }
        if(body.getPaymentTime()!=null){
            order.setPaymentTime(body.getPaymentTime());
        }
        if(body.getPostage()!=null){
            order.setPostage(body.getPostage());
        }
        if(body.getPaymentType()!=null){
            order.setPaymentType(body.getPaymentType());
        }
        if(body.getSendTime()!=null){
            order.setSendTime(body.getSendTime());
        }
        if(body.getStatus()!=null){
            order.setStatus(body.getStatus());
        }

        order=orderDAO.save(order);
        return order;

    }

    void deleteOrder(Long orderId) {
        Order order = orderDAO.findByOrderId(orderId);
        if (order != null) {
            orderDAO.delete(order);
        }
    }
}










































