package com.wayknew.demo.sku;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SkuDAO extends JpaRepository<Sku, Long> {
    Sku findBySkuId(Long skuId);
}
