package com.nadirFullStack.fullStackback.repository;

import com.nadirFullStack.fullStackback.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
