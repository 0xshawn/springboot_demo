package com.wayknew.demo.payment;


import com.wayknew.demo.payment.request.PaymentRequestDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentBO {
    @Resource
    private PaymentDAO paymentDAO;


    Payment create(Byte type,Integer amount,Byte status){
       Payment payment = new Payment();
        payment.setAmount(amount);
        payment.setStatus(status);
        payment.setType(type);

        return paymentDAO.save(payment);
    }

    Payment getPaymentById(Long paymentId) {
        return paymentDAO.findByPayId(paymentId);
    }

    List<Payment> getPaymentList() {
        return paymentDAO.findAll();
    }


    void deletePayment(Long paymentId) {
        Payment payment = paymentDAO.findByPayId(paymentId);
        if (payment != null) {
            paymentDAO.delete(payment);
        }
    }





    Payment updatePayment(Long paymentId, PaymentRequestDTO body) {
        Payment payment = paymentDAO.findByPayId(paymentId);


        if (body.getAmount() != null) {
            payment.setAmount(body.getAmount());
        }
        if (body.getStatus() != null) {
            payment.setStatus(body.getStatus());
        }
        if (body.getType() != null) {
            payment.setType(body.getType());
        }

        payment = paymentDAO.save(payment);
        return payment;
    }






}
