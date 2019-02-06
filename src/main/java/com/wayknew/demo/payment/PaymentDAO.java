package com.wayknew.demo.payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PaymentDAO extends JpaRepository<Payment, Long> {
    Payment findByPayId(Long paymentId);
}
