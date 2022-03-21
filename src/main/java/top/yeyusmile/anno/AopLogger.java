package top.yeyusmile.anno;
 
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;
 
/**
 * 注解
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopLogger {
}