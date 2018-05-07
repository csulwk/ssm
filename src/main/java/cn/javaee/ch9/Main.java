package cn.javaee.ch9;

import cn.javaee.ch9.pojo.JuiceMaker3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwk
 * @date 2018/1/9 14:42
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ch05/spring-cfg.xml");
        JuiceMaker3 maker3 = (JuiceMaker3) ctx.getBean("juiceMaker3");
        System.out.println(maker3.makeJuice());
        ctx.close();
    }
}
