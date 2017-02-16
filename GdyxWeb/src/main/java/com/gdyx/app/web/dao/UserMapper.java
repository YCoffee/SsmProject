package com.gdyx.app.web.dao;

import com.gdyx.app.web.model.User;

/**
 * Created by Administrator on 2017/2/16.
 */
public interface UserMapper {
    User findByName(String username);
}
