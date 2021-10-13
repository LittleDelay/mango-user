package com.mango.api.service;

import com.mango.api.common.constants.MangoConstants;
import com.mango.api.common.feign.MangoFeignConfig;
import com.mango.api.domain.UserRes;
import com.mango.core.bean.response.ResponseKit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 提供需要对其他服务暴露的接口
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/13 17:55
 */
@FeignClient(name = MangoConstants.SERVICE_NAME, decode404 = true, configuration = MangoFeignConfig.class)
public interface UserServiceApi {

    String BASE_URL = "/api/mango/examples";

    /**
     * 查询示例
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    @GetMapping(BASE_URL + "/{exampleId}")
    ResponseKit<UserRes> getUserById(@PathVariable("userId") Long userId);
}
