package com.redbird.marco.sys.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.redbird.marco.sys.model.User;
import com.redbird.marco.sys.service.SysUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping(value = "/api")
@Slf4j
public class SysUserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserController.class);
    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = "/user/listUsersByPages")
    @ApiOperation("用户信息分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页数", defaultValue = "1",dataType = "Integer", required = true),
            @ApiImplicitParam(name = "pageSize", value = "页码", defaultValue = "10",dataType = "Integer", required = true)
    })
    public ResponseEntity selectUsersByPageAndNum(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                  @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = sysUserService.listUserByPages();
        PageInfo<User> page = new PageInfo(users);
        LOGGER.debug("debugger level users: {}",users);
        LOGGER.info("info level users: {}",users);
        LOGGER.error("error level users: {}",users);

        return new ResponseEntity(page,HttpStatus.OK);
    }
    @GetMapping(value="/user_info")
    @ApiOperation("根据id获取用户详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id",dataType = "Long"),
    })
    public ResponseEntity findUserById(@RequestParam(value = "id", defaultValue = "0", required = true) Long id){
        User user = sysUserService.findUserById(id);
        log.info("user信息：{}",user);
        return new ResponseEntity(user,HttpStatus.OK);
    }

}
