package com.dc.service.basic;

import com.dc.bean.basic.User;

/**
 * @InterfaceName IUserService
 * @Description: TODO
 * @Author 王飞鱼
 * @Date 2020-7-2
 * @Version V1.0
 **/
public interface IUserService {
    /**
     * 登录
     * @Param name
     * @return User
     */
    User login(String name);
}
