package day04;

public class GoldCard extends Card{
    public GoldCard() {
    }

    public GoldCard(String name) {
        super(name);
    }

    @Override
    public void pay(double money) {
        System.out.println("金卡用户: " + getName() + ", 本次使用金卡消费" + (money * 0.8) + "元");
    }
}
