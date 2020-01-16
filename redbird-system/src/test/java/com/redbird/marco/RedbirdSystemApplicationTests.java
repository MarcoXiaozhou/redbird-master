package com.redbird.marco;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.redbird.marco.sys.dao.SysUserDao;
import com.redbird.marco.sys.model.User;
import com.redbird.marco.sys.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedbirdSystemApplicationTests {
    @Autowired
    SysUserDao sysUserDao;
    @Autowired
    SysUserService sysUserService;
    @Test
    public void contextLoads() {

    }
    @Test
    public void test(){
        User user = new User();
//        user.setId(1217002919849488385l);
        user.setUsername("关云长");
        user.setNickname("汉寿亭侯");
        user.setGender("男");
        user.setAge(38);
        user.setAddress("河东郡解县");
        user.setCreateTime(new Date());
//        user.setUpdateTime(new Date());
        int i = sysUserDao.insert(user);
        System.out.println("用户数："+i);
    }

}
