package com.gdyx.app.web.controller;

import com.gdyx.app.web.model.User;
import com.gdyx.app.web.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/login")
    public String doLginAction(String username, String password){
        System.out.println("-------------success-------------");
        User user = userService.doLoginService(username);
        if (user != null && user.getPassword().equals(password)){
            return "success";
        }else{
            return "fail";
        }
    }
}
