package cn.javaee.ch2.d;

/**
 * @author lwk
 * @date 2017/11/6 12:39
 */
public class Main {

    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TBObserver tbObserver = new TBObserver();
        observable.addObserver(tbObserver);
        JDObserver jdObserver = new JDObserver();
        observable.addObserver(jdObserver);
        observable.addProduct("Dell");

        SNObserver snObserver = new SNObserver();
        observable.addObserver(snObserver);
        observable.addProduct("Book");
        observable.addProduct("Cup");
    }
}
