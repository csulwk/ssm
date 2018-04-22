package cn.javaee.ch11.multi;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @author lwk
 * @date 2018/1/22 22:00
 */
@Aspect
@Order(2)
public class Aspect2 {

    @Pointcut("execution(* cn.javaee.ch11.multi.MultiBeanImpl.testMulti(..))")
    public void print(){}

    @Before("print()")
    public void before(){
        System.out.println("before 2...");
    }

    @After("print()")
    public void after(){
        System.out.println("after 2...");
    }

    @AfterThrowing("print()")
    public void afterThrowing(){
        System.out.println("afterThrowing 2...");
    }

    @AfterReturning("print()")
    public void afterReturning(){
        System.out.println("afterReturning 2...");
    }
}
