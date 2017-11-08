package cn.javaee.ch2.e;

/**
 * @author lwk
 * @date 2017/11/6 22:03
 */
public class Main {

    public static void main(String[] args) {
        TicketHelper helper = new TicketHelper();
        helper.buildAdult("成人票");
        helper.buildChildForSeat("有座儿童票");
        helper.buildElderly("老人票");
        helper.buildSoldier("军人票");
        Object ticket = TicketBuilder.builder(helper);
    }
}
