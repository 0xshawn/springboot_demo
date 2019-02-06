package com.wayknew.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDAO extends JpaRepository<User, Long> {

 /*   User findByPhone(Long userId);*/

    User findUserByUserId(Long userId);

}