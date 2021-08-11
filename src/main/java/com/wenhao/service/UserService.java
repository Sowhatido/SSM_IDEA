package com.wenhao.service;


import com.wenhao.bean.User;
import com.wenhao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAll() {
        System.out.println(userMapper+"222");
        return userMapper.getAll();
    }
}
