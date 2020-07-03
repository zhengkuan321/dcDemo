package com.dc.service.basic.impl;

import com.dc.bean.basic.User;
import com.dc.dao.basic.UserMapper;
import com.dc.service.basic.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author 王飞鱼
 * @Date 2020-7-2
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    UserMapper userMapper;
    /**
     * 登录
     * @return User
     */
    public User login(String name) {
        return userMapper.findUserByName(name);
    }

}
