package cn.javaee.ch12.mapper;

import cn.javaee.ch12.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author lwk
 * @date 2018/4/16 15:33
 */
@Repository
public interface RoleMapper {
    public int insertRole(Role role);
    public Role getRole(@Param("id") Long id);
    public int updateRole(Role role);
    public int deleteRole(@Param("id") Long id);
}
