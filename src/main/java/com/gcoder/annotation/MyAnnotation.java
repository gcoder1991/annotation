package com.gcoder.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by gcoder on 2017/6/2.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyAnnotation {
}
