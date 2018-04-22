package cn.javaee.ch11.xml;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author lwk
 * @date 2018/1/22 20:56
 */
public class XmlAspect {

    public void before() {
        System.out.println("before ...");
    }

    public void after() {
        System.out.println("after ...");
    }

    public void afterThrowing() {
        System.out.println("after-throwing ...");
    }

    public void afterReturning() {
        System.out.println("after-returning ...");
    }

    public void around(ProceedingJoinPoint jp) {
        System.out.println("around start ...");
        try{
            jp.proceed();
        }catch (Throwable e) {
            new RuntimeException("回调原有流程，产生异常 ...");
        }
        System.out.println("around end ...");
    }
}
