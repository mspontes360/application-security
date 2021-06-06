package com.avanade.security.security.app.repository;

import com.avanade.security.security.app.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<UserModel, String> {
}
