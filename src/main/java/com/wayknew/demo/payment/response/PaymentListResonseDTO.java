package com.wayknew.demo.payment.response;

import com.wayknew.demo.payment.PaymentDTO;

import java.util.List;

public class PaymentListResonseDTO {
    private Integer code;
    private String message;
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

    public List<PaymentDTO> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentDTO> payments) {
        this.payments = payments;
    }
}


