package day03;

public class Demo {
    public static void main(String[] args) {
        E e0 = new E();
        System.out.println(e0.toString());
        System.out.println(e0);

        D d = new D("李蕾", 19);
        System.out.println(d.toString());
        E e = new E("李蕾", 19, 70);
        System.out.println(d == e);
        System.out.println(d.equals(e));
        // super关键字
        d.checkNum();
        // 子类构造器
    }
}
