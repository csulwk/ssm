package cn.javaee.ch11;

/**
 * @author lwk
 * @date 2018/1/14 21:47
 */
public interface Interceptor {

    public void before(Object obj);

    public void after(Object obj);

    public void afterReturning(Object obj);

    public void afterThrowing(Object obj);
}
