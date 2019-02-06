package com.wayknew.demo.payment.response;

import com.wayknew.demo.payment.PaymentDTO;

import java.util.List;

public class PaymentResponseDTO {
    private Integer code;
    private String message;
    private PaymentDTO payment;
    private List<PaymentDTO> payments;

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

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public List<PaymentDTO> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentDTO> payments) {
        this.payments = payments;
    }
}
