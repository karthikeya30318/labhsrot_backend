package com.signup.repository;

import com.signup.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries can go here, for example:
    User findByUsername(String username);
}
