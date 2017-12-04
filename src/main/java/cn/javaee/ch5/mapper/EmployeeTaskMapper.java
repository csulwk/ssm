package cn.javaee.ch5.mapper;

import cn.javaee.ch5.pojo.EmployeeTask;

/**
 * @author lwk
 * @date 2017/11/30 22:04
 */
public interface EmployeeTaskMapper {
    public EmployeeTask getEmployeeTaskByEmpId(Long empId);
}
