package com.wayknew.demo.order;


import com.wayknew.demo.order.request.OrderRequestDTO;
import com.wayknew.demo.order.response.OrderResponseDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value="/api/v2")
public class OrderController {


    @Resource
    private OrderBO orderBO;

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public OrderResponseDTO createOrder(@RequestBody OrderRequestDTO body){
        try{
            Order order = orderBO.create(body.getUserId(),body.getProductId(),body.getOrderNo(),body.getPayment(),body.getPaymentType(),body.getPostage(),body.getStatus(),body.getPaymentTime(),body.getSendTime(),body.getEndTime(),body.getCloseTime());
            return OrderFactory.successResponse(order);
        }catch (Exception e){
            return OrderFactory.errorResponse(1,e.toString());
        }

    }


    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public OrderResponseDTO getOrderList() {
        try {
            List<Order> orders = orderBO.getOrderList();
            return OrderFactory.successResponse(orders);
        } catch (Exception e) {
            return OrderFactory.errorResponse(2, e.toString());
        }
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET)
    public OrderResponseDTO getOrderById(@PathVariable("orderId") Long orderId) {
        try {
            Order order = orderBO.getById(orderId);
            return OrderFactory.successResponse(order);
        } catch (Exception e) {
            return OrderFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.PATCH)
    public OrderResponseDTO updateOrder(@PathVariable("orderId") Long orderId,
                                      @RequestBody OrderRequestDTO body) {
        try {
            Order order = orderBO.updateOrder(orderId, body);
            return OrderFactory.successResponse(order);
        } catch (Exception e) {
            return OrderFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.DELETE)
    public OrderResponseDTO deleteOrder(@PathVariable("orderId") Long orderId) {
        try {
            orderBO.deleteOrder(orderId);
            return OrderFactory.successResponse();
        } catch (Exception e) {
            return OrderFactory.errorResponse(3, e.toString());
        }
    }
}
