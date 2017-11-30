package cn.javaee.ch5.pojo;

/**
 * 男性体检表
 * @author lwk
 * @date 2017/11/28 22:13
 */
public class MaleHealthForm extends HealthForm{
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
