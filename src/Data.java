public class Data {
    private String name;//气田名
    private String region;//气区
    private String type;//气藏类型
    private String depth;//埋深类型
    private double reserve;//储量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public double getReserve() {
        return reserve;
    }

    public void setReserve(double reserve) {
        this.reserve = reserve;
    }
    public static void main(String[] args) {
        Menu menu=new Menu();
        menu.start();
    }
}

