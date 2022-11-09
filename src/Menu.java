import java.util.ArrayList;
import java.util.Scanner;

public class Menu{
    ArrayList<Data> array = new Initial().initial();

    public void start() {
            System.out.println("************欢迎使用天然气储量管理系统************");
        while (true) {
            System.out.println("1 增加油田");
            System.out.println("2 删除油田");
            System.out.println("3 按气区查询");
            System.out.println("4 按气藏类型汇总");
            System.out.println("5 按埋深类型汇总");
            System.out.println("6 总体汇总");
            System.out.println("0 退出");
            System.out.println("*********************************************");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    addData(array);
                    break;
                case "2":
                    deleteData(array);
                    break;
                case "3":
                    findByRegion(array);
                    break;
                case "4":
                    findByType(array);
                    break;
                case "5":
                    findByDepth(array);
                    break;
                case "6":
                    findByTo(array);
                    break;
                case "0":
                    System.out.println("谢谢使用！");
                    System.exit(0);
                default:
                    System.out.println("不好意思，没有这个功能，请重新输入");
            }

        }
    }

    public static void addData(ArrayList<Data> array) {//增加气田
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入气田名：");
        String name = sc.next();
        System.out.println("请输入气区：");
        String region = sc.next();
        System.out.println("请输入气藏类型：");
        String type = sc.next();
        System.out.println("请输入埋深类型：");
        String depth = sc.next();
        System.out.println("请输入储量");
        double reserve = sc.nextDouble();
        Data d = new Data();
        d.setName(name);
        d.setRegion(region);
        d.setType(type);
        d.setDepth(depth);
        d.setReserve(reserve);
        array.add(d);
        System.out.println("增加成功！");
    }

    public static void deleteData(ArrayList<Data> array) {//删除气田
        System.out.println("请输入你要删除的气田名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for (Data data : array) {
            if (name.equals(data.getName())) {
                array.remove(data);
                break;
            }
        }
        System.out.println("删除成功！");
    }

    public static void findByRegion(ArrayList<Data> array) {//按气区查询
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入气区名称：");
        String region = sc.nextLine();
        System.out.println("气田名\t气区\t气藏类型\t埋深类型\t储量(亿方)\t");
        for (Data data : array) {
            if (region.equals(data.getRegion())) {
                System.out.printf("%s %s %s %s %.2f\n", data.getName(), data.getRegion(), data.getType(), data.getDepth(), data.getReserve());
            }
        }
    }

    public static void findByType(ArrayList<Data> array) {//按气藏类型汇总
        System.out.println("请输入气藏类型：");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        System.out.println("气区\t储量(亿方)\t");
        for (Data data : array) {
            if (type.equals(data.getType())) {
                System.out.printf("%s %.2f\n", data.getRegion(), data.getReserve());
            }
        }
    }

    public static void findByDepth(ArrayList<Data> array) {//按埋深类型汇总
        System.out.println("请输入埋深类型：");
        Scanner sc = new Scanner(System.in);
        String depth = sc.nextLine();
        System.out.println("气区\t储量(亿方)\t");
        for (Data data : array) {
            if (depth.equals(data.getDepth())) {
                System.out.printf("%s %.2f\n", data.getRegion(), data.getReserve());
            }
        }

    }
    public static void findByTo(ArrayList<Data> array) {//总体汇总
        System.out.println("气田名\t\t气区\t\t气藏类型\t\t埋深类型\t\t储量(亿方)\t\t");
        for (Data data : array) {
            System.out.printf("%-8s%-8s%-8s%-8s%.2f\n", data.getName(), data.getRegion(), data.getType(), data.getDepth(), data.getReserve());
        }
    }
}
