package day04.homework;


public class test {
    public static void main(String[] args) {
        // 选择题
        // 1-11  C D B C B C C D D B B

        // 编程题
        // 定义抽象类Animal，包含抽象方法eat()和普通方法drink()，
        // 创建Dog、Cat子类继承抽象类，重写eat()方法，测试多态调用
        Animal dog = new Dog();
        dog.drink();
        Animal cat = new Cat();
        cat.eat();
    }
}
