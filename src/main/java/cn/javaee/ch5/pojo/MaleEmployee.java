package cn.javaee.ch5.pojo;

/**
 * 男雇员类
 * @author lwk
 * @date 2017/11/30 21:47
 */
public class MaleEmployee extends Employee {
    private MaleHealthForm maleHealthForm = null;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
