package com.wayknew.demo.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CartDAO extends JpaRepository<Cart, Long> {
    Cart findCartByCartId(Long cardId);
}
