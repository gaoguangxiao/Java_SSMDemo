package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    //切入点，链接连接点
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){};

    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2(){};

//    2、共性代码，通知，将通知和切入点绑定，切面
    @Before("pt()")
    public Object before(){
        System.out.println("before advice ...");
        return 12;
    }

//  @After("pt()")
    public void after(){
        System.out.println("after advice ...");
    }

//  环绕通知，需要表名对原始数据的调用
    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //抛出异常
        pjp.proceed();
        System.out.println("around after advice ...");
    }

    @Around("pt2()")
    public Object aroundSelected(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");

        pjp.proceed();
        System.out.println("around after advice ...");
        return 200;
    }

    @AfterReturning("pt()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    @AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }
}
