package com.example.Spring_JWT.repository;

import com.example.Spring_JWT.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

    Boolean existsByUsername(String username);
}
