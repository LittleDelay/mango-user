package com.mango.user.domain.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mango_user")
public class User {
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
     */
    private Boolean sex;

    /**
     * 手机号
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 用户等级
     */
    @Column(name = "user_level")
    private Byte userLevel;

    /**
     * 出生日期
     */
    private Date birthday;

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
     * 证件类型
     */
    @Column(name = "user_id_card_type")
    private Byte userIdCardType;

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
    private Boolean status;

    /**
     * 删除状态【0已删除，1未删除】
     */
    @Column(name = "delete_status")
    private Boolean deleteStatus;

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
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
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
     * 获取性别【1男，2女】
     *
     * @return sex - 性别【1男，2女】
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别【1男，2女】
     *
     * @param sex 性别【1男，2女】
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号
     *
     * @return user_phone - 手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机号
     *
     * @param userPhone 手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取用户等级
     *
     * @return user_level - 用户等级
     */
    public Byte getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户等级
     *
     * @param userLevel 用户等级
     */
    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
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
     * 获取邮箱
     *
     * @return user_email - 邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置邮箱
     *
     * @param userEmail 邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 获取密码
     *
     * @return user_pwd - 密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置密码
     *
     * @param userPwd 密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 获取证件类型
     *
     * @return user_id_card_type - 证件类型
     */
    public Byte getUserIdCardType() {
        return userIdCardType;
    }

    /**
     * 设置证件类型
     *
     * @param userIdCardType 证件类型
     */
    public void setUserIdCardType(Byte userIdCardType) {
        this.userIdCardType = userIdCardType;
    }

    /**
     * 获取证件号
     *
     * @return user_id_card - 证件号
     */
    public String getUserIdCard() {
        return userIdCard;
    }

    /**
     * 设置证件号
     *
     * @param userIdCard 证件号
     */
    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard == null ? null : userIdCard.trim();
    }

    /**
     * 获取证件名
     *
     * @return user_id_card_name - 证件名
     */
    public String getUserIdCardName() {
        return userIdCardName;
    }

    /**
     * 设置证件名
     *
     * @param userIdCardName 证件名
     */
    public void setUserIdCardName(String userIdCardName) {
        this.userIdCardName = userIdCardName == null ? null : userIdCardName.trim();
    }

    /**
     * 获取用户介绍
     *
     * @return user_introduce - 用户介绍
     */
    public String getUserIntroduce() {
        return userIntroduce;
    }

    /**
     * 设置用户介绍
     *
     * @param userIntroduce 用户介绍
     */
    public void setUserIntroduce(String userIntroduce) {
        this.userIntroduce = userIntroduce == null ? null : userIntroduce.trim();
    }

    /**
     * 获取用户头像
     *
     * @return user_head_img - 用户头像
     */
    public String getUserHeadImg() {
        return userHeadImg;
    }

    /**
     * 设置用户头像
     *
     * @param userHeadImg 用户头像
     */
    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg == null ? null : userHeadImg.trim();
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取删除状态【0已删除，1未删除】
     *
     * @return delete_status - 删除状态【0已删除，1未删除】
     */
    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置删除状态【0已删除，1未删除】
     *
     * @param deleteStatus 删除状态【0已删除，1未删除】
     */
    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
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
}