package cn.javaee.ch11.xml;

import cn.javaee.ch11.aop.RoleService;
import cn.javaee.ch3.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwk
 * @date 2018/1/22 21:33
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ch05/spring-cfg4.xml");
        RoleService roleService = ctx.getBean(RoleService.class);
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("role_name_1");
        role.setNote("note_1");
        roleService.printRole(role);
    }
}
