package com.space.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/3/25 0025.
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BuryingPoint {

    String value() default "";
}
