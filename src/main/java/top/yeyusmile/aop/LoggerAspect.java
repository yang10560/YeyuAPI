package top.yeyusmile.aop;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import top.yeyusmile.anno.AopLogger;

import java.util.*;

/**
 * 切面
 */
@Aspect
@Component
public class LoggerAspect {


    /**
     * 指定切面的切入点
     */
    @Pointcut("@annotation(top.yeyusmile.anno.AopLogger)")
    public void pointcutAnnotation() {
    }

    /**
     * 返回通知：目标方法执行完并返回参数后触发。
     */
    @AfterReturning(value = "pointcutAnnotation()", returning = "result")
    public void methodAfterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("返回通知：方法名：" + methodName + "，" +
                "参数" + Arrays.asList(joinPoint.getArgs()) + "，" +
                "返回结果：");
        if (result instanceof String[]) {
            Arrays.stream((String[]) result).forEach(System.out::println);
        } else {
            System.out.println(result);
        }
    }


    /**
     * 环绕通知，围绕着方法执行
     * 环绕通知需要携带ProceedingJoinPoint类型的参数
     * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
     * 而且环绕通知必须有返回值，返回值即为目标方法的返回值
     */
    @Around(value = "pointcutAnnotation()")
    public Object methodAround(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        String methodName = proceedingJoinPoint.getSignature().getName();
        System.out.println("环绕通知：方法名：" + methodName + "，参数" + Arrays.asList(proceedingJoinPoint.getArgs()));
        //执行目标方法
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return result;
    }


}