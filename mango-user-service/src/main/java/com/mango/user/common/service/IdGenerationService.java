package com.mango.user.common.service;

/**
 * ID生成接口
 */
public interface IdGenerationService {

    /**
     * 生成业务主键
     *
     * @return 主键ID
     */
    Long getPkId();

}