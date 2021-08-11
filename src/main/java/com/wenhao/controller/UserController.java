package com.wenhao.controller;

import com.sun.deploy.net.HttpRequest;
import com.wenhao.bean.User;
import com.wenhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String aa(){
        return "user";
    }

    @RequestMapping("/getAll")
    public String getAll(ServletRequest request){

        System.out.println(userService);
        List<User> userList = userService.getAll();
        System.out.println(userList);
        request.setAttribute("userList",userList);
        return "user";
    }


}
