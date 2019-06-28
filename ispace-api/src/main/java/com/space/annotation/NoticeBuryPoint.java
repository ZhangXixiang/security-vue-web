package com.space.annotation;

import java.lang.annotation.*;

/**
 * 资讯公告aop
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NoticeBuryPoint {

    String value() default "";
}
