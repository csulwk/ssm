package cn.javaee.ch5.mapper;

import cn.javaee.ch5.pojo.Task;

/**
 * @author lwk
 * @date 2017/11/30 22:04
 */
public interface TaskMapper {
    public Task getTask(Long id);
}
