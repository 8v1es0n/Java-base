package day04;

public abstract class Card {
    private String name;

    public Card() {
    }

    public Card(String name) {
        this.name = name;
    }

    public abstract void pay(double money);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
