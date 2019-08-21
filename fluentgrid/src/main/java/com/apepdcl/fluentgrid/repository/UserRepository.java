package com.apepdcl.fluentgrid.repository;

import com.apepdcl.fluentgrid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
