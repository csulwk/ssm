package cn.javaee.ch11;

import cn.javaee.ch3.pojo.Role;

/**
 * @author lwk
 * @date 2018/1/14 21:52
 */
public class Main {
    public static void main(String[] args) {
        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleInterceptor();
        RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("role_name_1");
        role.setNote("role_note_1");
        proxy.printRole(role);
        System.out.println("####测试afterthrowing()方法");
        role = null;
        proxy.printRole(role);
    }
}
