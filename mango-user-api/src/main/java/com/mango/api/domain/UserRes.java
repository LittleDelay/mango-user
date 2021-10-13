package com.mango.api.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户返回信息
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/10/13 17:59
 */
@Data
@Accessors(chain = true)
public class UserRes implements Serializable {

    private static final long serialVersionUID = 5415570386874870749L;

    /**
     * 名称
     */
    private String name;

}
