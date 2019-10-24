package sda.tasks.stream.objects;

public class AbstractNucleoside implements Nucleoside {

    protected String ACRTbase;
    protected Integer width;

    public String getACRTbase() {
        return ACRTbase;
    }

    public Integer getWight() {
        return width;
    }

    public void setACRTbase(String ACRTbase) {
        this.ACRTbase = ACRTbase;
    }

    public void setWight(Integer width) {
        this.width = width;
    }
}
