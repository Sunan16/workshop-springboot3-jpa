package com.sunan.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunan.courseSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
