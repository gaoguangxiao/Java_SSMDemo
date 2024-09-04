package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    public void pt(){}

//    @Before("pt()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice");
    }

//    @After("pt()")
    public void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 999;
        Object o = pjp.proceed(args);
        return o;
    }

//  需要定义具有返回值的形参
    @AfterReturning(value = "pt()",returning = "ret")
    public void afterReturning(Object ret){
        System.out.println("afterReturning advice..." + ret);
    }

    //抛出异常后通知可以获取切入点方法出现的异常信息，使用形参可以接受对应的异常对象
    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterthrowing(Throwable t){
        System.out.println("afterReturning advice..." + t);
    }
}
