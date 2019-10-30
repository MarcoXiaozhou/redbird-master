package com.redbird.marco.sys.service;

import com.redbird.marco.sys.model.User;

import java.util.List;

/**
 * @Author: fanwz
 * @Date: 2019/10/29 16:34
 */
public interface SysUserService {

    List<User> listUserByPages();
    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    User findUserById(Long id);

}
