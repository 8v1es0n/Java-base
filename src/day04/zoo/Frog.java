package day04.zoo;

public class Frog extends Animal implements Swimming{
    @Override
    public void eat() {
        System.out.println("青蛙爱吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("只会蛙泳");
    }
}
