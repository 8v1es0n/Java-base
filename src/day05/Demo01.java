package day05;

public class Demo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("武松");
        System.out.println(s2);

        String s3 = null;
        System.out.println(s3.length());

        //一旦创建则无法改变
        String str = "hello";   // 第1步：堆里(准确的说堆里的字符串常量池小块内存区域)创建 "hello" 对象，str 指向它
        str = "world";          // 第2步：堆里创建 "world" 对象，str 改指向它
        // "hello" 原封不动躺在那儿，只是没人引用了
        System.out.println(str);
    }
}
