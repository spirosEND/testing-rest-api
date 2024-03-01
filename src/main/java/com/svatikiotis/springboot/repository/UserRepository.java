package com.svatikiotis.springboot.repository;

import com.svatikiotis.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
