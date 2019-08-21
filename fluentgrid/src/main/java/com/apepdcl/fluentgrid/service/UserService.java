package com.apepdcl.fluentgrid.service;

import com.apepdcl.fluentgrid.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
