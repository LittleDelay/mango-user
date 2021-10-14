package com.mango.user.controller;

import com.mango.api.domain.UserRes;
import com.mango.api.service.UserServiceApi;
import com.mango.core.bean.response.ApiResponse;
import com.mango.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/13 17:53
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据ID查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    @GetMapping(value = UserServiceApi.BASE_URL + "/{userId}")
    public ApiResponse<UserRes> getUserById(@PathVariable("userId") String userId) {
        return userService.getUserById(Long.valueOf(userId));
    }

}
