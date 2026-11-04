package day03;

public class D extends C{
    private String name;
    private int age;
    int num = 20;

    public D() {
    }

    public D(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名: " + this.name + "年龄: " + this.age;
    }

    public boolean equals(E e){
        return this.age == e.getAge();
    }

    public void checkNum(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
