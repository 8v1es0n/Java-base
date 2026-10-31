package day01;

public class Demo10 {
    // 循环结构
    public static void main(String[] args) {
        // while循环
        int num = 0;
        while (num < 5){
            System.out.println("当前num为: " + num);
            num++;
        }

        // for循环
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + i;
        }
        System.out.println("1~10 的和为: " + sum);
    }
}
