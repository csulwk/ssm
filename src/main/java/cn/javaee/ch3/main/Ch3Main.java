package cn.javaee.ch3.main;

import cn.javaee.ch3.mapper.RoleMapper;
import cn.javaee.ch3.pojo.Role;
import cn.javaee.ch3.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * 程序入口
 * @author lwk
 * @date 2017/11/7 22:22
 */
public class Ch3Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger(Ch3Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            log.info(role.getRoleName());

            Role role2 = new Role();
            role2.setId(2L);
            role2.setRoleName("ab");
            role2.setNote("ababab");
            int res = roleMapper.insertRole(role2);
            log.info(res);

            List<Role> list = roleMapper.findRoles("a");
            log.info(list.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }

        System.out.println("----END----");
    }
}
