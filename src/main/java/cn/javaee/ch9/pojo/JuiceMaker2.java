package cn.javaee.ch9.pojo;

/**
 * @author lwk
 * @date 2018/1/9 14:33
 */
public class JuiceMaker2 {
    private String beverageShop = null;
    private Source source = null;

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice(){
        String juice = "这是一杯由" + beverageShop + "饮品店提供的"
                + source.getSize() + source.getSugar() + source.getFruit();
        return juice;
    }
}
