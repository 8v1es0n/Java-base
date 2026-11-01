package day02.object;

public class Student {
    // 属性
    String name;
    private int age;
    // 行为
    public void speak(){
        String name = "赵四";
        System.out.println(name + "正在输出鸟语花香");
        System.out.println(this.name + "经常出口成章");
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
        if(age < 0 || age > 150){
            System.out.println("输入的年龄有误!");
        } else {
            this.age = age;
        }
    }
}
