package com.gdyx.app.web.service.impl;

import com.gdyx.app.web.dao.UserMapper;
import com.gdyx.app.web.model.User;
import com.gdyx.app.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/16.
 */
@Service
public class UserServiceImpl implements UserService {
   @Autowired
    private UserMapper userMapper;

    public User doLoginService(String username) {
        return userMapper.findByName(username);
    }
}
