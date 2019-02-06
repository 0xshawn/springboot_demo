package com.wayknew.demo.payment;

import com.wayknew.demo.cart.Cart;
import com.wayknew.demo.payment.response.PaymentResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class PaymentFactory {
    static PaymentDTO toPaymentDTO(Payment payment) {
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setAmount(payment.getAmount());
        paymentDTO.setCreatedAt(payment.getCreatedAt());
        paymentDTO.setPayId(payment.getPayId());
        paymentDTO.setStatus(payment.getStatus());
        paymentDTO.setUpdatedAt(payment.getUpdatedAt());
        paymentDTO.setType(payment.getType());
        return paymentDTO;
    }

    static PaymentResponseDTO successResponse() {
        PaymentResponseDTO res = new PaymentResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;
    }

    static PaymentResponseDTO successResponse(Payment payment) {
        PaymentDTO paymentDTO = toPaymentDTO(payment);
        PaymentResponseDTO res = new PaymentResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setPayment(paymentDTO);
        return res;
    }


    static PaymentResponseDTO successResponse(List<Payment> payments) {
        List<PaymentDTO> paymentDTOList = new ArrayList<>();
        payments.forEach(user -> {
            paymentDTOList.add(toPaymentDTO(user));
        });
        PaymentResponseDTO res = new PaymentResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setPayments(paymentDTOList);
        return res;
    }


    static PaymentResponseDTO errorResponse(Integer code, String message) {
        PaymentResponseDTO res = new PaymentResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }

}
