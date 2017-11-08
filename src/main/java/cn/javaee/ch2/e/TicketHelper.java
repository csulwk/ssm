package cn.javaee.ch2.e;

/**
 * 建造者模式，配置类
 * @author lwk
 * @date 2017/11/6 21:57
 */
public class TicketHelper {
    public void buildAdult(String info){
        System.out.println("构建成年人票逻辑："+info);
    }

    public void buildChildForSeat(String info){
        System.out.println("构建有座儿童票逻辑："+info);
    }

    public void buildElderly(String info){
        System.out.println("构建有老年人票逻辑："+info);
    }

    public void buildSoldier(String info){
        System.out.println("构建军人及其家属票逻辑："+info);
    }
}
