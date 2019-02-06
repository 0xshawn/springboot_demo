package com.wayknew.demo.payment;

import com.wayknew.demo.cart.Cart;
import com.wayknew.demo.payment.request.PaymentRequestDTO;
import com.wayknew.demo.payment.response.PaymentResponseDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v6")
public class PaymentController {
    @Resource
    private PaymentBO paymentBO;

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public PaymentResponseDTO createPayment(@RequestBody PaymentRequestDTO body) {
        try {
            Payment payment = paymentBO.create(body.getType(),body.getAmount(),body.getStatus());
            return PaymentFactory.successResponse(payment);
        } catch (Exception e) {
            return PaymentFactory.errorResponse(1, e.toString());
        }
    }





    @RequestMapping(value = "/payment", method = RequestMethod.GET)
    public PaymentResponseDTO getPaymentList() {
        try {
            List<Payment> payments = paymentBO.getPaymentList();
            return PaymentFactory.successResponse(payments);
        } catch (Exception e) {
            return PaymentFactory.errorResponse(2, e.toString());
        }
    }

    @RequestMapping(value = "/payment/{paymentId}", method = RequestMethod.GET)
    public PaymentResponseDTO getPaymentById(@PathVariable("paymentId") Long paymentId) {
        try {
            Payment payment = paymentBO.getPaymentById(paymentId);
            return PaymentFactory.successResponse(payment);
        } catch (Exception e) {
            return PaymentFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/payment/{paymentId}", method = RequestMethod.PATCH)
    public PaymentResponseDTO updatePayment(@PathVariable("paymentId") Long paymentId,
                                         @RequestBody PaymentRequestDTO body) {
        try {
            Payment payment = paymentBO.updatePayment(paymentId, body);
            return PaymentFactory.successResponse(payment);
        } catch (Exception e) {
            return PaymentFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/payment/{paymentId}", method = RequestMethod.DELETE)
    public PaymentResponseDTO deletePayment(@PathVariable("paymentId") Long paymentId) {
        try {
            paymentBO.deletePayment(paymentId);
            return PaymentFactory.successResponse();
        } catch (Exception e) {
            return PaymentFactory.errorResponse(3, e.toString());
        }
    }


}
