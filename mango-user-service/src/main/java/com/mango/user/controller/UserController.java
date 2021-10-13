package com.mango.user.controller;

import com.mango.api.domain.UserRes;
import com.mango.core.bean.response.ResponseKit;
import com.mango.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/13 17:53
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public ResponseKit<UserRes> getUserById(String userId) {
        userService.getUserById(Long.valueOf(userId));
    }

}
