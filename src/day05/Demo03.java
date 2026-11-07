package day05;

import java.util.Scanner;

public class Demo03 {
 /*
完成用户登录
    系统正确的登录名和密码是：admin/123456，
    请在控制台开发一个登录界面，接收用户输入的登录名和密码，
    判断用户是否登录成功，登录成功后展示：“欢迎进入系统!”，即可停止程序
    （注意：要求最多给用户三次登录机会）
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名: ");
            String userName = sc.next();
            System.out.print("请输入密码: ");
            String password = sc.next();
            if (userName.equals("admin") && password.equals("123456")){
                System.out.println("欢迎进入系统!");
                break;
            } else if (i < 2){
                System.out.println("账号或密码错误, 您还有 " + (2 - i) + " 次机会");
            } else {
                System.out.println("设备已锁定, 请稍后重试. . .");
            }
        }
    }
}
