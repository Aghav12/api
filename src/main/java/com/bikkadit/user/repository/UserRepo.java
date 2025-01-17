package com.bikkadit.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadit.user.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
