package day03.emp;

public class Coder extends People{

    public Coder(String name, int uid, double salary) {
        super(name, uid, salary);
    }

    @Override
    public void work() {
        System.out.println("名字为: " + getName() + "的程序员, "
                + "工资为: " + getSalary()
                + "工号为: " + getUid() + "正在猛猛写代码 . . .");
    }
}
