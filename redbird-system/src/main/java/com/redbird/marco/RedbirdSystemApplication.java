package com.redbird.marco;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * redbird
 * @author fanwz
 * @desc
 */
@SpringBootApplication
@MapperScan("com.redbird.marco.sys.dao")
public class RedbirdSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedbirdSystemApplication.class, args);
        System.out.println("启动成功");
    }

}
