package day01;

public class Demo01 {
    public static void main(String[] args) {
        // 单行注释
        System.out.println("Hello-World");
        /* 多行
        注释 */
        System.out.println("人生难得几回闲");

        // 整数
        byte by = 100;
        short sh = 20000;
        int i = 300000;
        long l = 4567890123L;
        System.out.println("整数类型: -byte-"+ by + "-short-" + sh + "-int-" + i + "-long-" + l);
        // 浮点
        float f = 3.15f;
        double d = 0.123456;
        System.out.println("打印小数: " + 1.2);
        System.out.println("浮点类型: -float-" + f + "-double-" + d);
        // 布尔
        boolean bo = true;
        System.out.println(bo);
        System.out.println(false);
        // 字符
        System.out.println('a');
        // 字符串
        System.out.println("坚持就是胜利");
    }
}
