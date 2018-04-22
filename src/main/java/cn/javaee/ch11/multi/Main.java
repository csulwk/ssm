package cn.javaee.ch11.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lwk
 * @date 2018/1/22 22:09
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MultiConfig.class);
        MultiBean mb = ctx.getBean(MultiBean.class);
        mb.testMulti();
    }
}
