package cn.javaee.ch21.service;

import cn.javaee.ch21.pojo.Role;

import java.util.List;

/**
 * @author lwk
 * @date 2018/5/7 9:47
 */
public interface RoleService {

    public Role getRole(Long id);
    public Role insertRole(Role role);
    public int updateRole(Role role);
    public int deleteRole(Long id);
    public List<Role> findRoles(String roleName, String note);
}
