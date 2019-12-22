package com.annotation.type;

/**
 * @author yue.lou
 * @since 2019/12/22
 */
import java.lang.annotation.*;


@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationType {
    String value() default "";
}
