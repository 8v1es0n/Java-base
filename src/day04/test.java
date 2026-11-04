package day04;

public class test {
    public static void main(String[] args) {
        People p = new Student();

        // 抽象类不能实例化
        // Animal animal = new Animal();
        Cat cat = new Cat();
        cat.eat();

        GoldCard goldCard = new GoldCard();
        goldCard.setName("曹操");
        goldCard.pay(10000);

        SilverCard silverCard = new SilverCard();
        silverCard.setName("张飞");
        silverCard.pay(1000);
    }

    public static void show(People p) {
        p.run();
        // 类强转异常
        // Student stu = (Student) p;
        // stu.study();

        // 强转前判断
        if (p instanceof Student){
            Student stu = (Student) p;
            stu.study();
        }

        if (p instanceof Teacher tea){
            tea.teach();
        }
    }
}
