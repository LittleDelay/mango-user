package com.mango.user.service;

import com.mango.api.domain.UserRes;
import com.mango.core.bean.response.ResponseKit;

/**
 * 用户service
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/13 17:25
 */
public interface UserService {

    ResponseKit<UserRes> getUserById(Long id);
}
