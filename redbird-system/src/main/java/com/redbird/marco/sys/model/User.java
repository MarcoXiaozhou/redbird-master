package com.redbird.marco.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: fanwz
 * @Date: 2019/10/29 16:35
 */
@TableName("sys_user")
@Data
public class User implements Serializable {


    private Long id;

    private String username;

    private String nickname;

    private int age;

    private String gender;


    private String mobilePhone;

    private String address;


    private Date createTime;

    private Date updateTime;

//    private Integer pageNum;
//
//    private Integer pageSize;
}
