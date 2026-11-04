package day04.inter;

public class Demo {
    public static void main(String[] args) {
        // 接口不能实例化
        // InterA interA = new InterA();
        Son son = new Son();
        son.methodA();
        son.methodB();
    }
}
