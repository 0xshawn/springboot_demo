package com.wayknew.demo.user;

import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDAO extends JpaRepository<User, Long> {



    User findByPhone(Long id);
    public void delete(User user);

 /*   User deleteUserBy(Long id);
    User u*/



}