package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.serviceImplement.ImpleLoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qfcomputer on 2018/5/27.
 */

@Controller
public class LoginController {

    @Autowired
    ImpleLoginService impleLoginService;
    @Autowired
    User user;

    @RequestMapping("/login")
    public String  login(){
        return "login";
    }

    @RequestMapping("/loginResult")
    @ResponseBody
    public String home(HttpServletRequest request){
        String name=request.getParameter("name");
        String passwd=request.getParameter("passwd");
        user=impleLoginService.loginResult(name,passwd);
        if(passwd.equals(user.getPasswd()))
            return "登录成功";
        else
            return "登录失败";
    }


}
