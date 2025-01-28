package com.taskmanagement.repository;

import com.taskmanagement.model.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
        Optional<User> findByUsername(String username);

        @NonNull
        Page<User> findAll(@NonNull Pageable pageable);

        boolean existsByUsername(String username);
}
