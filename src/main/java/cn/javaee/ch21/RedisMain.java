package cn.javaee.ch21;

import cn.javaee.ch21.pojo.Role;
import cn.javaee.ch21.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwk
 * @date 2018/5/7 9:23
 */
public class RedisMain {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ch21/spring-cfg.xml");
        RoleService roleService = ctx.getBean(RoleService.class);
        Role role = new Role();
        role.setRoleName("role_name_tbd");
        role.setNote("role_note_tbd");

        roleService.insertRole(role);
        Role getRole = roleService.getRole(role.getId());
        getRole.setNote("role_note_tbd_update");

        roleService.updateRole(getRole);

        System.out.println("----END----");
    }
}
