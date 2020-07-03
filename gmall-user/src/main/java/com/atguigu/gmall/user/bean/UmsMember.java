package com.atguigu.gmall.user.bean;

import lombok.Data;

import java.util.Date;
/**
 * @description:
 * @author: 107944
 * @date: 2020-07-02 16:18
 */
@Data
public class UmsMember {
    private String id;
    private String memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private int status;
    private Date createTime;
    private String icon;
    private int gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private int sourceType;
    private int integration;
    private int growth;
    private int luckeyCount;
    private int historyIntegration;


}
