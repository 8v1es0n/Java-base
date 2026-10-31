package day01;

public class Demo02 {
    public static void main(String[] args) {
        // 自动类型转换
        char c = 'z';
        int d = c;
        System.out.println(d);
        char ch = 'a';
        int sh = ch;
        System.out.println(sh);
        // 强制类型转换
        int i = 130;
        byte b = (byte) i;
        System.out.println(b);
    }
}
