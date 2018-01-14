package cn.javaee.ch9.bean;

import org.springframework.beans.factory.DisposableBean;

/**
 * @author lwk
 * @date 2018/1/9 14:51
 */
public class DisposableBeanImpl implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("调用接口DisposableBean的destroy方法");
    }
}
