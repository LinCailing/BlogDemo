package com.hyl.service.impl;

import com.hyl.mapper.UserMapper;
import com.hyl.pojo.User;
import com.hyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByusername(username);
    }
}
