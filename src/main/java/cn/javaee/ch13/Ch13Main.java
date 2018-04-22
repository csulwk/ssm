package cn.javaee.ch13;

import cn.javaee.ch13.pojo.Role;
import cn.javaee.ch13.service.RoleListService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwk
 * @date 2018/4/22 15:51
 */
public class Ch13Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ch13/spring-cfg.xml");
        RoleListService roleListService = ctx.getBean(RoleListService.class);
        List<Role> roleList = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            Role role = new Role();
            role.setRoleName("role_name_"+i);
            role.setNote("note_"+i);
            roleList.add(role);
        }
        int count = roleListService.insertRoleList(roleList);
        System.out.println(count);

        System.out.println("----END----");
    }
}
