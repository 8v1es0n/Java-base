package day03.emp;

public class Manager extends People{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, int uid, double salary, double bonus) {
        super(name, uid, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("名字为: " + getName() + "的经理, "
                + "工资为: " + getSalary()
                + "工号为: " + getUid() + "正在监督程序员 . . .");
    }
}
