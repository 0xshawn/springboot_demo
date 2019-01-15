package com.wayknew.demo.cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDAO extends JpaRepository<Cart, Long> {
    Cart findCartByCartId(Long cardId);
}
