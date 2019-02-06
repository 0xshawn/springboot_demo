package com.wayknew.demo.login;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoginDAO extends JpaRepository<Login, Long> {
    Login findByLoginId(Long loginId);
}
