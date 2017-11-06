package cn.javaee.ch2.c;

import java.lang.reflect.Method;

/**
 * 拦截器接口
 * @author lwk
 * @date 2017/11/4 12:39
 */
public interface Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args);
    public void around(Object proxy, Object target, Method method, Object[] args);
    public void after(Object proxy, Object target, Method method, Object[] args);
}
