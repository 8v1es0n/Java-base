package day02;

public class Demo03 {
    public static void main(String[] args) {
        oddEven(99);
    }

    // 判断一个数的奇偶
    public static void oddEven(int n){
        if (n % 2 == 0) {
            System.out.println(n + "是一个偶数");
        } else {
            System.out.println(n + "是一个奇数");
        }
    }
}
