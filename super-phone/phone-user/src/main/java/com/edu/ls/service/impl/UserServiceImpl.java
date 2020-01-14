package com.edu.ls.service.impl;

import com.edu.ls.mapper.UserMapper;
import com.edu.ls.model.UserModel;
import com.edu.ls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserModel queryUserByUname(String uname) {
        return userMapper.queryUserByUname(uname);
    }
}
