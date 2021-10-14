package com.mango.user.service.impl;

import com.mango.api.domain.UserRes;
import com.mango.core.bean.response.ApiResponse;
import com.mango.core.bean.response.ResponseKit;
import com.mango.user.dao.UserMapper;
import com.mango.user.domain.model.User;
import com.mango.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service 实现
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/13 17:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据ID查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    @Override
    public ApiResponse<UserRes> getUserById(Long userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        UserRes userRes = new UserRes();
        BeanUtils.copyProperties(user, userRes);
        return ResponseKit.success(userRes);
    }
}
