package day03.homework;

public class test {
    public static void main(String[] args) {
        // 4. 方法重写
        SmartPhone sp = new SmartPhone();
        sp.call();

        // 5. 子类构造器调用父类构造器
        VipUser admin = new VipUser("admin", "1234", 3);
        System.out.println(admin.toString());

        System.out.println(MathUtil.round(2.2));
        System.out.println(MathUtil.round(2.7));
        System.out.println(MathUtil.round(-2.2));
        System.out.println(MathUtil.round(-2.7));
    }

}
