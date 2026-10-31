package day01;

public class Demo07 {
    public static void main(String[] args) {
        // 三目运算符
        int score = 98;
        //数据类型 变量名 = 条件表达式 ? 表达式1 : 表达式2;
        String result = score >= 60 ? "及格" : "不及格";
        System.out.println(result);

        //案例2: 使用三元运算符，判断两个整数中的最大值，并打印
        int a = 10;
        int b = 20;
        //数据类型 变量名 = 条件表达式 ? 表达式1 : 表达式2;
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
