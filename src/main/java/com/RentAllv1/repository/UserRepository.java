package com.RentAllv1.repository;

import com.RentAllv1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);

    public List<User> findAllByOrderByCreatedAtDesc();
}
