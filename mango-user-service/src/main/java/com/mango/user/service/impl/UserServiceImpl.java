package com.mango.user.service.impl;

import com.mango.api.domain.UserRes;
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

    @Override
    public ResponseKit<UserRes> getUserById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        UserRes userRes = new UserRes();
        BeanUtils.copyProperties(user, userRes);
        return ResponseKit.success(userRes);
    }
}
