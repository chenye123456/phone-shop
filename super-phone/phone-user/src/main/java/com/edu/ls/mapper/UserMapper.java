package com.edu.ls.mapper;

import com.edu.ls.model.UserModel;

public interface UserMapper {
    //根据用户名查询用户
    public UserModel queryUserByUname(String uname);
}
