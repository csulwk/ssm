package cn.javaee.ch11;

import cn.javaee.ch3.pojo.Role;

/**
 * @author lwk
 * @date 2018/1/14 21:48
 */
public class RoleServiceImpl implements RoleService {

    @Override
    public void printRole(Role role) {
        System.out.println("{ id="+role.getId()
                + ", roleName=" + role.getRoleName()
                + ", note=" + role.getNote() + " }");
    }
}
