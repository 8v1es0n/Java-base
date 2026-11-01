package day02;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容: ");
        String next = sc.next();
        System.out.println("输入的内容是: " + next);

        System.out.println("请输入整数: ");
        int nextInt = sc.nextInt();
        System.out.println("输入的整数是: " + nextInt);

        System.out.println("请输入小数: ");
        double nextDouble = sc.nextDouble();
        System.out.println("输入的小数是: " + nextDouble);
    }
}
