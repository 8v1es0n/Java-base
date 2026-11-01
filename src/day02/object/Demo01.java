package day02.object;

public class Demo01 {
    public static void main(String[] args) {
        // 创建对象
        Student student = new Student();
        // 属性赋值
        /* student.name = "张三";
            student.age = 20;
            System.out.println("学生姓名: "+ student.name + " 学生的年龄: " + student.age);
            student.speak(); */
            System.out.println("==========");
            student.name = "王小美";
            student.setAge(18);
            System.out.println("学生姓名: "+ student.name + " 学生的年龄: " + student.getAge());
            student.speak();
    }
}
