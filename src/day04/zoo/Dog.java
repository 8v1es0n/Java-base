package day04.zoo;

public class Dog extends Animal implements Swimming{
    @Override
    public void eat() {
        System.out.println("狗爱啃骨头");
    }

    @Override
    public void swim() {
        System.out.println("只会狗刨");
    }
}
