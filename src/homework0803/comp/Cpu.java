package homework0803.comp;

public class Cpu {
    private int dominantFrequency;//定义主频
    private String coreQuantity;//定义核心数量
    private String type;

    public Cpu() {}

    public Cpu(int dominantFrequency, String coreQuantity, String type) {
        this.dominantFrequency = dominantFrequency;
        this.coreQuantity = coreQuantity;
        this.type = type;
    }

    public int getDominantFrequency() {
        return dominantFrequency;
    }

    public void setDominantFrequency(int dominantFrequency) {
        this.dominantFrequency = dominantFrequency;
    }

    public String getCoreQuantity() {
        return coreQuantity;
    }

    public void setCoreQuantity(String coreQuantity) {
        this.coreQuantity = coreQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void work(){
        System.out.println("主频："+getDominantFrequency());
        System.out.println("核心数量："+getCoreQuantity());
    }
}
