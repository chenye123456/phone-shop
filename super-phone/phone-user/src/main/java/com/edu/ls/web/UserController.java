package com.edu.ls.web;

import com.edu.ls.model.UserModel;
import com.edu.ls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("Tologin")
    public String Tologin() {
        System.out.println(123);

        return "redirect:login.html";
    }

    @RequestMapping("login2")
    public String login(UserModel userModel) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");

        return "index";
    }




}
