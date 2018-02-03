package com.aronsh.chapter2.annotation;

import java.lang.annotation.*;

/**
 * @author wangyakun
 * @email yakun0622@gmail.com
 * @date 2018/2/3 17:11
 */
@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();
}
