package com.wayknew.demo.address;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AddressDAO extends JpaRepository<Address, Long> {
    Address findByAddressId(Long addressId);
}
