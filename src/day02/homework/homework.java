package day02.homework;

public class homework {
    public static void main(String[] args) {
    // 选择题
    // 1~5:     C B B D B
    // 6~ 10:   C C B B C
    // 11~ 15:  B B A B B
    // 16~ 20:  B B C B A

        // day01 编程题
        int min = findMin(10, 20, 30);
        System.out.println("找最小值: " + min);
        System.out.println(sum(1, 2));
        System.out.println(sum(11.1f, 22.2f));
        System.out.println(sum(10, 20, 30));

        // 创建 Person 对象赋值并输出所有属性
        Person person = new Person();
        person.setName("关羽");
        person.setAge(32);
        person.setGender(null);
        System.out.println("姓名" + person.getName() + "年龄" + person.getAge() + "性别" + person.getGender());

        Book book1 = new Book();
        System.out.println("BOOK的名字" + book1.getName() + "价格" +book1.getPrice());
        Book book2 = new Book("围城", 39.9);
        System.out.println("BOOK的名字" + book1.getName() + "价格" +book1.getPrice());

        new Cat("小白", 3, "白色");
        System.out.println("姓名" + person.getName() + "年龄" + person.getAge() + "颜色" + person.getGender());
        new Dog("小黑", 3, "中华田园犬");
        System.out.println("姓名" + person.getName() + "年龄" + person.getAge() + "品种" + person.getGender());
    }

    // 定义一个方法，方法能够接收三个整数，然后找出的最小值返回
    public static int findMin(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else{
            return b > c ? b : c;
        }
    }

    // 定义重载方法，分别实现两个整数求和、两个小数求和、三个整数求和，在main方法中分别调用并输出结果
    public static int sum(int x, int y){
        return x + y;
    }

    public static float sum(float x, float y){
        return x + y;
    }

    public static int sum(int x, int y, int z){
        return x + y + z;
    }


}
