package day02.inherit;

public class Demo {
    public static void main(String[] args) {
        B b = new B();
        // 子类使用父类的非私有的属性和方法
        b.study();
        b.score = 90;
        System.out.println(b.score);

        Student stu = new Student();
        stu.setName("貂蝉");
        stu.setAge(18);
        stu.setHobby("打游戏");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getHobby());

        System.out.println("----------------------------");
        Teacher tea = new Teacher();
        tea.setName("关羽");
        tea.setAge(32);
        tea.setSkill("教学");
        System.out.println(tea.getName());
        System.out.println(tea.getAge());
        System.out.println(tea.getSkill());
    }
}
