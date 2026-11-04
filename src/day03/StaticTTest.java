package day03;

public class StaticTTest {
    public static void main(String[] args) {
        // 创建对象, 没有static修饰
        Student stu1 = new Student();
        stu1.name = "吕布";
        System.out.println(stu1.name);

        Student stu2 = new Student();
        System.out.println(stu2.name);

        System.out.println("==================");

        // 静态修饰
        Student.nationality = "中国";
        System.out.println(Student.nationality);

        Student stu3 = new Student();
        System.out.println(Student.nationality);

        System.out.println("==================");

        Teacher teacher = new Teacher();
        teacher.work();
        Teacher.eat();
        System.out.println("==================");
        // - 静态方法中可以访问静态的变量和方法
        show();
        // 不能访问非静态的变量和方法
        //  nice();

        // 工具类
        System.out.println(MathUtil.max(123, 321));
        System.out.println(MathUtil.min(345, 678));
        System.out.println(MathUtil.sum(135, 246));

        // Math工具类
        System.out.println(Math.PI);
        System.out.println(Math.abs(123));
        System.out.println(Math.ceil(10.3));
        System.out.println(Math.floor(10.3));
        System.out.println(Math.round(10.3));
        System.out.println(Math.round(10.7));

        // 多态
        D D = new E();
    }

    public static void show(){
        System.out.println("show method");
    }
    public void nice(){
        System.out.println("not nice");
    }
}
