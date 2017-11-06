package cn.javaee.ch2.c;


import cn.javaee.ch2.b.HelloWorld;
import cn.javaee.ch2.b.HelloWorldImpl;

/**
 * @author lwk
 * @date 2017/11/4 20:55
 */
public class Main {

    public static void main(String[] args) {
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "cn.javaee.ch2.c.MyInterceptor");
        proxy.sayHelloWorld();
    }
}
