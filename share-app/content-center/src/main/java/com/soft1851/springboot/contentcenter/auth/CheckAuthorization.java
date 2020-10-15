package com.soft1851.springboot.contentcenter.auth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhengliang
 * @description TODO
 * @Data 2020/10/14
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAuthorization {
    String value();
}