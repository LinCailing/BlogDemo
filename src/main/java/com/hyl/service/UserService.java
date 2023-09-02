package com.hyl.service;

import com.hyl.pojo.User;

public interface UserService {
    void add(User user);

    User selectByUsername(String username);
}
