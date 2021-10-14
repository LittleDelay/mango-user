package com.mango.user.service;

import com.mango.api.domain.UserRes;
import com.mango.core.bean.response.ApiResponse;

/**
 * 用户service
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/13 17:25
 */
public interface UserService {

    /**
     * 根据ID查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    ApiResponse<UserRes> getUserById(Long userId);
}
