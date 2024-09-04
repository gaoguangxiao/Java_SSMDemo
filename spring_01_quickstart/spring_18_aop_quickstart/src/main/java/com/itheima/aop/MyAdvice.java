package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//用于加载此文件
@Component
//作为AOP
@Aspect
public class MyAdvice {

    //切入点，链接连接点
//    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    @Pointcut("execution(void com.itheima.dao.BookDao.*())")
    private void pt(){};

//    切入点表达式标准格式：动作关键字（访问修饰符 返回值 包名.类/接口名.方法名(参数) 异常名）
//    动作关键字：描述改切入点的行为动作，例如execution表示执行到指定切入点
//    访问修饰符：public，private等，可以忽略
//    返回值 void 类
//    包名
//    类/接口名
//    参数
//    异常名：抛出异常

//    通配符
//    *：单个独立的任意符号，可以独立出现，也可以作为前缀或者后缀的匹配符出现
//    execution (public * com.itheima.*.User.find*(*))
//    匹配com,itheima包下任意包中的User类或接口的所有find开头的带有一个参数的方法
//    ..：多个连续符号，可以独立出现，常用于简化包名与参数的方法
//    execution (public User com..UserService.findById(..))
//    匹配 com包下任意包中的UserService类或接口中所有名称为findById的方法
//    +：专用于子匹配子类类型
//    execution(* *..*Service+.*(..))
//    匹配任意包下接口或类的子类结尾以Service的方法

    /**/

//    2、共性代码，通知，将通知和切入点绑定，切面
    @Before("pt()")
    public void method(){
        Long startTime = System.currentTimeMillis();
        System.out.println(startTime);
    }
}
