package day02.construct;

public class Demo {
    public static void main(String[] args) {
        // 有参构造
        Student stu = new Student("赵四", 22);
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        // 空参构造
        Student stu1 = new Student();
    }
}
