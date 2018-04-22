package cn.javaee.ch11.multi;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @author lwk
 * @date 2018/1/22 22:00
 */
@Aspect
@Order(3)
public class Aspect1 {

    @Pointcut("execution(* cn.javaee.ch11.multi.MultiBeanImpl.testMulti(..))")
    public void print(){}

    @Before("print()")
    public void before(){
        System.out.println("before 1...");
    }

    @After("print()")
    public void after(){
        System.out.println("after 1...");
    }

    @AfterThrowing("print()")
    public void afterThrowing(){
        System.out.println("afterThrowing 1...");
    }

    @AfterReturning("print()")
    public void afterReturning(){
        System.out.println("afterReturning 1...");
    }
}
