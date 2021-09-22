package com.mango.user.common.annotation;

import java.lang.annotation.*;

/**
 * 注解敏感信息类中敏感字段的注解
 *
 * @Documented：注解信息会被添加到Java文档中
 * @Target：注解作用的位置，ElementType.FIELD表示该注解仅能作用于字段上
 * @Retention：注解的生命周期，表示注解会被保留到什么阶段，可以选择编译阶段、类加载阶段，或运行阶段
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/6/22 10:42
 */
@Documented
@Inherited
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SensitiveField {
}
