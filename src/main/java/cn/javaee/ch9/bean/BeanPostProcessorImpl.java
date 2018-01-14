package cn.javaee.ch9.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author lwk
 * @date 2018/1/9 14:49
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("["+o.getClass().getSimpleName()+"]"+s+"开始实例化");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("["+o.getClass().getSimpleName()+"]"+s+"实例化完成");
        return o;
    }
}
