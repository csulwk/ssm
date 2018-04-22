package cn.javaee.ch11.multi;

import org.springframework.stereotype.Component;

/**
 * @author lwk
 * @date 2018/1/22 21:59
 */
@Component
public class MultiBeanImpl implements MultiBean {
    @Override
    public void testMulti() {
        System.out.println("test multi aspects");
    }
}
