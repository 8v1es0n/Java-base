package day04;

public class SilverCard extends Card{
    public SilverCard() {
    }

    public SilverCard(String name) {
        super(name);
    }

    @Override
    public void pay(double money) {
        System.out.println("银卡用户: :" + getName() + ", 本次使用金卡消费" + (money * 0.8) + "元");
    }
}
