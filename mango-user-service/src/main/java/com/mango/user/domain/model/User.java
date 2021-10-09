package com.mango.user.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

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
     * 性别【1男，2女】
     * {@link com.mango.core.enums.GenderEnum}
     */
    private Short sex;

    /**
     * 删除状态【0已删除，1未删除】
     * {@link com.mango.core.enums.DeleteStatusEnum}
     */
    @Column(name = "delete_status")
    private Short deleteStatus;

    /**
     * 手机号
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 证件类型
     * {@link com.mango.core.enums.IdTypeEnum}
     */
    @Column(name = "user_id_card_type")
    private Short userIdCardType;

    /**
     * 用户等级
     * {@link com.mango.core.enums.LvEnum}
     */
    @Column(name = "user_level")
    private Short userLevel;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 邮箱
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 密码
     */
    @Column(name = "user_pwd")
    private String userPwd;

    /**
     * 盐
     */
    private String salt;

    /**
     * 证件号
     */
    @Column(name = "user_id_card")
    private String userIdCard;

    /**
     * 证件名
     */
    @Column(name = "user_id_card_name")
    private String userIdCardName;

    /**
     * 用户介绍
     */
    @Column(name = "user_introduce")
    private String userIntroduce;

    /**
     * 用户头像
     */
    @Column(name = "user_head_img")
    private String userHeadImg;

    /**
     * 状态
     */
    private Short status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;
}