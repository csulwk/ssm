package cn.javaee.ch13.mapper;

import cn.javaee.ch13.pojo.Role;
import org.springframework.stereotype.Repository;

/**
 * @author lwk
 * @date 2018/4/22 16:47
 */
@Repository
public interface RoleMapper {
    public int insertRole(Role role);
}
