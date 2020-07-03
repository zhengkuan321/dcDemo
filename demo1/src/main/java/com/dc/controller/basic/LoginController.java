package com.dc.controller.basic;

import com.dc.bean.basic.User;
import com.dc.service.basic.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Description: 登录handler
 * @Author 王飞鱼
 * @Date 2020-7-2
 * @Version V1.0
 **/
@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    IUserService userServiceImpl;
    @RequestMapping("checkName")
    public User login(String name){
        //1 参数校验
        //2 调用service
        try {
            User user = userServiceImpl.login(name);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
