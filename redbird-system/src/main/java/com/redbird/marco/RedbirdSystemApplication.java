package com.redbird.marco;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.redbird.marco.sys.dao")
public class RedbirdSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedbirdSystemApplication.class, args);
        System.out.println("启动成功");
    }

}
