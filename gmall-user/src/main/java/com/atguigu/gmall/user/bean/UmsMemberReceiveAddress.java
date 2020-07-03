package com.atguigu.gmall.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: 107944
 * @date: 2020-07-03 11:15
 */
@Data
public class UmsMemberReceiveAddress implements Serializable {

    private String id;
    private String memberId;
    private String  name;
    private String  phoneNumber;
    private int defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
}
