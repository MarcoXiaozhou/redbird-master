package com.redbird.marco.sys.model;

import lombok.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Author: fanwz
 * @Date: 2019/10/29 16:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private Long id;

    private String username;

    private String nickname;

    private int age;

    private String gender;


    private String mobilePhone;

    private String address;


    private Timestamp createTime;

//    private Integer pageNum;
//
//    private Integer pageSize;
}
