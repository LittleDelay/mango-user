package com.mango.user.domain.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mango_user")
public class User {
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

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取删除状态
     *
     * @return delete_status - 删除状态
     */
    public Short getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置删除状态
     *
     * @param deleteStatus 删除状态
     */
    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取电话
     *
     * @return user_phone - 电话
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置电话
     *
     * @param userPhone 电话
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取证件类型
     *
     * @return user_id_card_type - 证件类型
     */
    public Integer getUserIdCardType() {
        return userIdCardType;
    }

    /**
     * 设置证件类型
     *
     * @param userIdCardType 证件类型
     */
    public void setUserIdCardType(Integer userIdCardType) {
        this.userIdCardType = userIdCardType;
    }

    /**
     * 获取用户等级
     *
     * @return user_level - 用户等级
     */
    public Short getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户等级
     *
     * @param userLevel 用户等级
     */
    public void setUserLevel(Short userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取用户类型
     *
     * @return user_type - 用户类型
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型
     *
     * @param userType 用户类型
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取邮箱
     *
     * @return user_email - 邮箱
     */
    public byte[] getUserEmail() {
        return userEmail;
    }

    /**
     * 设置邮箱
     *
     * @param userEmail 邮箱
     */
    public void setUserEmail(byte[] userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取密码
     *
     * @return user_pwd - 密码
     */
    public byte[] getUserPwd() {
        return userPwd;
    }

    /**
     * 设置密码
     *
     * @param userPwd 密码
     */
    public void setUserPwd(byte[] userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public byte[] getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(byte[] salt) {
        this.salt = salt;
    }

    /**
     * 获取证件号
     *
     * @return user_id_card - 证件号
     */
    public byte[] getUserIdCard() {
        return userIdCard;
    }

    /**
     * 设置证件号
     *
     * @param userIdCard 证件号
     */
    public void setUserIdCard(byte[] userIdCard) {
        this.userIdCard = userIdCard;
    }

    /**
     * 获取证件名
     *
     * @return user_id_card_name - 证件名
     */
    public byte[] getUserIdCardName() {
        return userIdCardName;
    }

    /**
     * 设置证件名
     *
     * @param userIdCardName 证件名
     */
    public void setUserIdCardName(byte[] userIdCardName) {
        this.userIdCardName = userIdCardName;
    }

    /**
     * 获取用户介绍
     *
     * @return user_introduce - 用户介绍
     */
    public byte[] getUserIntroduce() {
        return userIntroduce;
    }

    /**
     * 设置用户介绍
     *
     * @param userIntroduce 用户介绍
     */
    public void setUserIntroduce(byte[] userIntroduce) {
        this.userIntroduce = userIntroduce;
    }

    /**
     * 获取用户头像
     *
     * @return user_head_img - 用户头像
     */
    public byte[] getUserHeadImg() {
        return userHeadImg;
    }

    /**
     * 设置用户头像
     *
     * @param userHeadImg 用户头像
     */
    public void setUserHeadImg(byte[] userHeadImg) {
        this.userHeadImg = userHeadImg;
    }
}