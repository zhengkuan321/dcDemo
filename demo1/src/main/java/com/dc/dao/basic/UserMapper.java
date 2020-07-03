package com.dc.dao.basic;

import com.dc.bean.basic.User;
/**
 * @InterfaceName UserMapper
 * @Description: UserMapper
 * @Author 王飞鱼
 * @Date 2020-7-2
 * @Version V1.0
 **/
public interface UserMapper {
    /**
     * 根据姓名查询用户
     * @return
     */
    User findUserByName(String name);
}
