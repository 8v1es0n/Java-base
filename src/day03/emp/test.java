package day03.emp;

public class test {
    public static void main(String[] args) {
        // 无参
        Manager xiaoqiao = new Manager();
        xiaoqiao.setName("小乔");
        xiaoqiao.setUid(1001);
        xiaoqiao.setSalary(5000);
        xiaoqiao.setBonus(1000);
        System.out.println("============================");

        // 有参
        Manager daqiao = new Manager("大乔", 1002, 6000, 700);
        daqiao.work();
        System.out.println("============================");

        // 程序员
        Coder zhouyu = new Coder("周瑜", 1002, 6000);
        zhouyu.work();
    }
}
