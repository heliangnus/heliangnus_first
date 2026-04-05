package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.PageResult;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    //声明mapper层属性
    @Autowired
    private UserMapper userMapper;
    //查询所有的用户信息
    @Override
    public PageResult<User> selUserInfoService(Integer pageNum,Integer pageSize) {
        //1. 开启分页查询
        Page<User> page = PageHelper.startPage(pageNum, pageSize);
        //2. 调用mapper层完成分页查询
        userMapper.selUserInfoMapper();
        //3. 获取分页结果

        return new PageResult<>(page.getResult(),page.getTotal());
    }
}
