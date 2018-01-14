package cn.javaee.ch11;

/**
 * @author lwk
 * @date 2018/1/14 21:47
 */
public class ProxyBeanFactory {

    public static <T> T getBean(T obj, Interceptor interceptor){
        return (T) ProxyBeanUtil.getBean(obj, interceptor);
    }
}
