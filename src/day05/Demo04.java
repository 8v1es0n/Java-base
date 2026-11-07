package day05;


/*
StringBuilder类
    代表可变的字符串对象，理解为一个操作字符串的容器
    相对于String来说, 本类更适合用在频繁操作字符串的情况下

StringBuilder常用方法
    public StringBuilder(): 构建一个空的可变字符串对象
    public StringBuilder(String str): 构建一个指定内容的可变字符串对象

    public StringBuilder append(任意对象): 拼接数据并返回本身
    public void reverse(): 翻转内容
    public int length(): 返回长度
    public String toString(): 将StringBuilder转为String对象并返回
*/
public class Demo04 {
    public static void main(String[] args) {
        //创建空的StringBuilder
        StringBuilder sb1 = new StringBuilder();
        //创建一个带初始值的StringBuilder
        StringBuilder sb2 = new StringBuilder("黑马");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println("================================");

        //2. 字符拼接
        //StringBuilder它的方法会改变StringBuilder对象本身的内容 所有称为可变对象
        sb2.append("程序").append("员");
        System.out.println(sb2);//黑马程序员

        //3. 反转内容
        sb2.reverse();//员序程马黑

        //4. 返回长度
        System.out.println(sb2.length());// 5

        //5. 转为字符串
        String s = sb2.toString();
        System.out.println(s);// 员序程马黑
    }
}

