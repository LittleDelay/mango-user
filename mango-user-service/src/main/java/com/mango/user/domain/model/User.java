package com.mango.user.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 用户表
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/6/22 10:42
 */
@Data
@Table(name = "mango_user")
public class User implements Serializable {

    private static final long serialVersionUID = 3750190400724118764L;

    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 删除状态
     */
    @Column(name = "delete_status")
    private Short deleteStatus;

    /**
     * 电话
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 证件类型
     */
    @Column(name = "user_id_card_type")
    private Integer userIdCardType;

    /**
     * 用户等级
     */
    @Column(name = "user_level")
    private Short userLevel;

    /**
     * 用户类型
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 状态
     */
    private Short status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 邮箱
     */
    @Column(name = "user_email")
    private byte[] userEmail;

    /**
     * 密码
     */
    @Column(name = "user_pwd")
    private byte[] userPwd;

    /**
     * 盐
     */
    private byte[] salt;

    /**
     * 证件号
     */
    @Column(name = "user_id_card")
    private byte[] userIdCard;

    /**
     * 证件名
     */
    @Column(name = "user_id_card_name")
    private byte[] userIdCardName;

    /**
     * 用户介绍
     */
    @Column(name = "user_introduce")
    private byte[] userIntroduce;

    /**
     * 用户头像
     */
    @Column(name = "user_head_img")
    private byte[] userHeadImg;
}