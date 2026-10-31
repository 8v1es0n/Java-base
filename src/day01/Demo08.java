package day01;

public class Demo08 {
    // if 分支结构
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18){
            System.out.println("你已经成年~");
        } else {
            System.out.println("你是未成年~");
        }
        double sccore = 95;
        if (sccore >= 90 && sccore <= 100){
            System.out.println("奖励山地车一辆~");
        } else if (sccore >= 80) {
            System.out.println("游乐场畅玩一天~");
        } else if (sccore >= 60) {
            System.out.println("胖揍一顿~");
        } else {
            System.out.println("分数错误!");
        }
    }
}
