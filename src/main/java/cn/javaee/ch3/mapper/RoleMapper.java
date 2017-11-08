package cn.javaee.ch3.mapper;

import cn.javaee.ch3.pojo.Role;

import java.util.List;

/**
 * 映射器接口
 * @author lwk
 * @date 2017/11/7 22:23
 */
public interface RoleMapper {
    public int insertRole(Role role);
    public int deleteRole(Long id);
    public int updateRole(Role role);
    public Role getRole(Long id);
    public List<Role> findRoles(String roleName);
}
