package day02;

public class Demo01 {
    // 定义方法
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int sum = getSum(10, 20);
        System.out.println("和为:" + sum);
    }
}
