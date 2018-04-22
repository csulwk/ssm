package cn.javaee.ch12;

import cn.javaee.ch12.mapper.RoleMapper;
import cn.javaee.ch12.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwk
 * @date 2018/4/16 16:39
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg12.xml");
        RoleMapper roleMapper = ctx.getBean(RoleMapper.class);
        Role role = new Role();
        role.setRoleName("role_name_mapper");
        role.setNote("note_mapper");
        roleMapper.insertRole(role);

        Long id = role.getId();
        roleMapper.getRole(id);
        role.setNote("note_mapper_update");
        roleMapper.updateRole(role);
        roleMapper.deleteRole(id);

        System.out.println("----END----");
    }
}
