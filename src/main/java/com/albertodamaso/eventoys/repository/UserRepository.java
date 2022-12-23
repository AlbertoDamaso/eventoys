package com.albertodamaso.eventoys.repository;

import com.albertodamaso.eventoys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{
}