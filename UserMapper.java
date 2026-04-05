package com.bjsxt.mapper;

import com.bjsxt.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    //查询所有的用户信息
    @Mapper
    List<User> selUserInfoMapper();
}
