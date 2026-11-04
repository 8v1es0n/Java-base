package day04.inter;

public class Son implements InterA, InterB{
    @Override
    public void methodA() {
        System.out.println("son 得 methodA 方法");
    }

    @Override
    public void methodB() {
        System.out.println("son 得 methodB 方法");
    }
}
