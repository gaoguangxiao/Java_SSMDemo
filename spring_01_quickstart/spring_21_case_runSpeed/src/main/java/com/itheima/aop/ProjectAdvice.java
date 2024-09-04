package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    //匹配业务包下com.itheima.service所有以Service结尾的类或者接口的任意方法
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void servicePt(){};

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        Long endTime = System.currentTimeMillis();

        Signature signature = pjp.getSignature();
        Class className = signature.getDeclaringType();
        System.out.println("getDeclaringType:" + className);

        String methodName =  signature.getName();
        System.out.println("getName:" + methodName);

        System.out.println("万次耗时：" + className + methodName + "-----"+(endTime - startTime) + "ms");
    }

}
