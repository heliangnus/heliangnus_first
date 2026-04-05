package com.bjsxt.controller;

import com.bjsxt.pojo.PageResult;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("userController")
public class UserController {
    //声明业务层属性
    @Autowired
    private UserService userService;
    //声明单元方法:查询所有的用户信息
    @RequestMapping("userInfo")
    @ResponseBody
    public PageResult<User> userInfo(Integer page, Integer rows){
        return userService.selUserInfoService(page,rows);
    }
}
