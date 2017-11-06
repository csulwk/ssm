package cn.javaee.ch2.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ch2Main {
    public static void main(String[] args) {
        reflect();

        System.out.println("----END----");
    }

    public static Object reflect() {
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl) Class.forName("cn.javaee.ch2.a.ReflectServiceImpl").newInstance();
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object, "你好");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return object;
    }
}
