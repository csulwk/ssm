package cn.javaee.ch21.dao;

import cn.javaee.ch21.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lwk
 * @date 2018/5/7 9:29
 */
@Repository
public interface RoleDao {

    public Role getRole(Long id);
    public int deleteRole(Long id);
    public int insertRole(Role role);
    public int updateRole(Role role);
    public List<Role> findRoles(String roleName, String note);
}
