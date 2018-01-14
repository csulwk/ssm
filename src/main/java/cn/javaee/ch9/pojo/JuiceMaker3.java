package cn.javaee.ch9.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author lwk
 * @date 2018/1/9 14:33
 */
public class JuiceMaker3 implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean{
    private String beverageShop = null;
    private Source2 source = null;

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source2 getSource() {
        return source;
    }

    public void setSource(Source2 source) {
        this.source = source;
    }

    public String makeJuice(){
        String juice = "这是一杯由" + beverageShop + "饮品店，提供的"
                + source.getSize() + source.getSugar() + source.getFruit();
        return juice;
    }

    public void init(){
        System.out.println("["+this.getClass().getSimpleName()+"]执行JuiceMaker3自定义初始化方法");
    }

    public void destroy(){
        System.out.println("["+this.getClass().getSimpleName()+"]执行JuiceMaker3自定义销毁方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("["+this.getClass().getSimpleName()+"]调用BeanNameAware接口的setBeanName方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]调用BeanFactoryAware接口的setBeanFactory方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]调用ApplicationContext接口的setApplicationContext方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"]调用InitializingBean接口的afterPropertiesSet方法");
    }


}
