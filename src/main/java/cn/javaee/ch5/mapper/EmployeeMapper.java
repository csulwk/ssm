package cn.javaee.ch5.mapper;

import cn.javaee.ch5.pojo.Employee;

/**
 * @author lwk
 * @date 2017/12/4 14:09
 */
public interface EmployeeMapper {
    public Employee getEmployee(Long id);
}
