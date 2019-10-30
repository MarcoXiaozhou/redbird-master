package com.redbird.marco.sys.service.impl;

import com.redbird.marco.sys.dao.SysUserDao;
import com.redbird.marco.sys.model.User;
import com.redbird.marco.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author: fanwz
 * @Date: 2019/10/29 17:09
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    @Override
    public List<User> listUserByPages() {
        return sysUserDao.selectByPageNumSize();
    }

    @Override
    public User findUserById(Long id) {
        return sysUserDao.findUserById(id);
    }
}
