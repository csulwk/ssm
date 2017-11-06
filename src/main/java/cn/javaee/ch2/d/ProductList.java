package cn.javaee.ch2.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者，Publish
 * @author lwk
 * @date 2017/11/6 12:26
 */
public class ProductList extends Observable {

    //产品列表
    private List<String> productList = null;

    //类唯一实例
    private static ProductList instance;

    /**
     * 取得唯一实例
     * @return 产品列表唯一实例
     */
    public static ProductList getInstance(){
        if (instance == null){
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }

    /**
     * 增加观察者
     * @param observer 观察者
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表新增了产品："+newProduct);
        //设置被观察对象发生变化
        this.setChanged();
        this.notifyObservers(newProduct);
    }

}
