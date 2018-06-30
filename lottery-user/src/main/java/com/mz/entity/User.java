package com.mz.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author mz
 * @Description：用户实体类
 * @date 2018/6/29
 * @time 22:54
 */
@Entity
@Data
public class User {
    /**
     * 用户的编号
     */
    @Id
    private String uid;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户密码
     */
    @JsonIgnore
    private String password;
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 用户的头像
     */
    private String headimg;
    /**
     * 当前用户的生日
     */
    private String birthday;
    /**
     * 用户的状态:0 未激活, 1,已激活, 2: 已封号
     */
    private Integer state;
    /**
     * 账户余额
     */
    private double money;
}
