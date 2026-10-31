package day01;

public class Demo03 {
    // 算术运算符
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        // 字符串参与输出拼接
        System.out.println("abc" + a);
        System.out.println(a + b + "abc");
        System.out.println('a' + b + "abc");

        System.out.println(10.0 / 3);

        // 自增自减
        ++a;
        System.out.println(a);
        int x = a++;
        System.out.println(x);
        int y = --b;
        System.out.println(y);
    }
}
