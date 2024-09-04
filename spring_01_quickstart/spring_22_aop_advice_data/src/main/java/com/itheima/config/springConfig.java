package com.itheima.config;


import com.itheima.aop.MyAdvice;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.itheima")

@Import(MyAdvice.class)

@EnableAspectJAutoProxy
public class springConfig {

}
