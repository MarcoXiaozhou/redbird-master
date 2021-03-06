package com.redbird.marco.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.redbird.marco.sys.model.User;

import java.util.List;

/**
 * @Author: fanwz
 * @Date: 2019/10/30 9:05
 */
public interface SysUserDao extends BaseMapper<User> {
    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return
     */
     User findUserById(Long id);

    /**
     * 分页查询
     * @return
     */
     List<User> selectByPageNumSize();


}
