package cn.javaee.ch13.service.impl;

import cn.javaee.ch13.pojo.Role;
import cn.javaee.ch13.service.RoleListService;
import cn.javaee.ch13.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lwk
 * @date 2018/4/22 17:09
 */
@Service
public class RoleListServiceImpl implements RoleListService {

    @Autowired
    private RoleService roleService = null;
    Logger log = Logger.getLogger(RoleListServiceImpl.class);

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public int insertRoleList(List<Role> roleList) {
        int count = 0;
        for (Role role:roleList){
            try{
                count += roleService.insertRole(role);
            } catch (Exception ex){
                log.info(ex);
            }
        }
        return count;
    }
}
