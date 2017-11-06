package cn.javaee.ch2.b;

import cn.javaee.ch2.a.ReflectServiceImpl;

public class Main {
    public static void main(String[] args) {

        //JDK动态代理
        /*JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();*/

        //CGLIB动态代理
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
        obj.sayHello("张三");
    }
}
