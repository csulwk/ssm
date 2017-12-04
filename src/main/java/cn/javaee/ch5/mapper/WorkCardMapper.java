package cn.javaee.ch5.mapper;

import cn.javaee.ch5.pojo.WorkCard;

/**
 * @author lwk
 * @date 2017/11/30 22:04
 */
public interface WorkCardMapper {
    public WorkCard getWorkCardByEmpId(Long empId);
}
