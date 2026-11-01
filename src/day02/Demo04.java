package day02;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("两个int参数类型的和为:" + getSum(10, 20));
        System.out.println("一个int一个double参数类型的和为:" + getSum(10, 20.9));
        System.out.println("三个int参数类型的和为:" + getSum(10, 20, 30));
        System.out.println("两个float参数类型的和为:" + getSum(21.3, 32.4));
    }

    // 方法的重载
    public static int getSum(int x, int y){
        return x + y;
    }

    public static double getSum(double x, double y){
        return x + y;
    }

    public static double getSum(int x, double y){
        return x + y;
    }

    public static int getSum(int x, int y, int z){
        return x + y + z;
    }
}
