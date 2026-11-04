package day03;

public class E extends D{
    double score;
    public E() {
    }

    public E(String name, int age ,double score) {
        // 先执行父类构造
        super(name, age);
        // 子类构造
        this.score = score;
    }

    @Override
    public void newFriend(){
        System.out.println("和好友用微信联系---");
    }
}
