package domain;

import java.util.List;

public class PageBean<Object>
{
    private int pc;//当前页码page code
    //private int tp; //总页数 total pages
    private int tr;//总记录数 total records
    private int pr;//每页记录数 page records
    private List<Object> beanList;//当前页的记录
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getTp()
    {
        int tp=tr/pr;//总记录数÷每页记录数=页数
        return tr % pr == 0 ? tp : tp + 1 ;//是否有多余的，如果有多余的+1页
    }

    public int getTr() {
        return tr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public List<Object> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<Object> beanList) {
        this.beanList = beanList;
    }
}
