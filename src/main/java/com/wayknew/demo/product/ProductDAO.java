package com.wayknew.demo.product;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Long> {

    Product findByPhone(Long id);

    Product findProductById(Long id);
}
