import java.util.ArrayList;

public class Initial {
    public ArrayList<Data> initial() {
        ArrayList<Data> array = new ArrayList<Data>();

        Data data1 = new Data();
        data1.setName("普光气田");
        data1.setRegion("四川盆地");
        data1.setType("常规气");
        data1.setDepth("浅层气");
        data1.setReserve(1000.00);
        array.add(data1);

        Data data2 = new Data();
        data2.setName("龙王庙组气藏");
        data2.setRegion("四川盆地");
        data2.setType("煤层气");
        data2.setDepth("中浅层气");
        data2.setReserve(2000.00);
        array.add(data2);

        Data data3 = new Data();
        data3.setName("涪陵页岩气田");
        data3.setRegion("四川盆地");
        data3.setType("页岩气");
        data3.setDepth("中浅层气");
        data3.setReserve(3000.00);
        array.add(data3);

        Data data4 = new Data();
        data4.setName("元坝气田");
        data4.setRegion("四川盆地");
        data4.setType("致密气");
        data4.setDepth("深层气");
        data4.setReserve(4000.00);
        array.add(data4);

        Data data5 = new Data();
        data5.setName("克拉2气田");
        data5.setRegion("塔里木盆地");
        data5.setType("常规气");
        data5.setDepth("浅层气");
        data5.setReserve(5000.00);
        array.add(data5);

        Data data6 = new Data();
        data6.setName("迪那2气田");
        data6.setRegion("塔里木盆地");
        data6.setType("致密气");
        data6.setDepth("中浅层气");
        data6.setReserve(6000.00);
        array.add(data6);

        Data data7 = new Data();
        data7.setName("克深气田");
        data7.setRegion("塔里木盆地");
        data7.setType("页岩气");
        data7.setDepth("深层气");
        data7.setReserve(7000.00);
        array.add(data7);

        Data data8 = new Data();
        data8.setName("涩北气田");
        data8.setRegion("柴达木盆地");
        data8.setType("常规气");
        data8.setDepth("浅层气");
        data8.setReserve(8000.00);
        array.add(data8);

        Data data9 = new Data();
        data9.setName("苏里格气田");
        data9.setRegion("陕甘宁盆地");
        data9.setType("常规气");
        data9.setDepth("浅层气");
        data9.setReserve(9000.00);
        array.add(data9);

        Data data10 = new Data();
        data10.setName("靖边气田");
        data10.setRegion("陕甘宁盆地");
        data10.setType("煤层气");
        data10.setDepth("深层气");
        data10.setReserve(10000.00);
        array.add(data10);

        Data data11 = new Data();
        data11.setName("大牛地气田");
        data11.setRegion("陕甘宁盆地");
        data11.setType("页岩气");
        data11.setDepth("中浅层气");
        data11.setReserve(11000.00);
        array.add(data11);
        return array;
    }
}
