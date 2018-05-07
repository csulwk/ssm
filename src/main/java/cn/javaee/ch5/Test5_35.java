package cn.javaee.ch5;

import cn.javaee.ch3.utils.SqlSessionFactoryUtils;
import cn.javaee.ch5.mapper.EmployeeMapper;
import cn.javaee.ch5.pojo.Employee;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * @author lwk
 * @date 2017/12/4 14:57
 */
public class Test5_35 {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            Logger logger = Logger.getLogger(Test5_35.class);
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1L);
            logger.info("----"+employee.getBirthday()+"----");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }

    }
}
