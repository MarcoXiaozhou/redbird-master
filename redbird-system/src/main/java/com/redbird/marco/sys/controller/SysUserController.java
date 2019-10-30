package com.redbird.marco.sys.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.redbird.marco.sys.model.User;
import com.redbird.marco.sys.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Author: fanwz
 * @Date: 2019/10/29 16:31
 */
@RestController
@RequestMapping(value = "api")
@Slf4j
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/listusers/{pageNum}/{pageSize}")
    public ResponseEntity selectUsersByPageAndNum(@PathVariable(value = "pageNum") Integer pageNum,
                                                  @PathVariable(value = "pageSize") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = sysUserService.listUserByPages();
        PageInfo<User> page = new PageInfo(users);
        return new ResponseEntity(page,HttpStatus.OK);
    }
    @GetMapping(value="/user/{id}")
    public ResponseEntity findUserById(@PathVariable(value = "id") Long id){
        User user = sysUserService.findUserById(id);
        log.info("user信息：{}",user);
        return new ResponseEntity(user,HttpStatus.OK);
    }
}
