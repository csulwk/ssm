package cn.javaee.ch11.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lwk
 * @date 2018/1/14 21:52
 */
public class ProxyBeanUtil implements InvocationHandler {

    //被代理对象
    private Object obj;
    //拦截器
    private Interceptor interceptor = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObj = null;
        boolean exceptionFlag = false;
        interceptor.before(obj);
        try {
            retObj = method.invoke(obj, args);
        } catch (Exception ex){
            exceptionFlag = true;
        } finally {
            interceptor.after(obj);
        }
        if (exceptionFlag){
            interceptor.afterThrowing(obj);
        }else {
            interceptor.afterReturning(obj);
        }
        return retObj;
    }

    public static <T> Object getBean(Object obj, Interceptor interceptor) {

        ProxyBeanUtil _this = new ProxyBeanUtil();
        _this.obj = obj;
        _this.interceptor = interceptor;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),_this);
    }
}
