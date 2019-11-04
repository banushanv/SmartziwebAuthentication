package com.SmartziWeb.auth.service;

import com.SmartziWeb.auth.model.User;

public interface UserService {
    void save(User user);

    User findByFirstname(String username);
}
