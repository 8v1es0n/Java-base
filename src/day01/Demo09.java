package day01;

public class Demo09 {
    public static void main(String[] args) {
        // switch 分支结构
        int month = 10;
        // 旧版本
        switch (month){
            case 1, 2, 12:
                System.out.println("冬季");
                break;
            case 3, 4, 5:
                System.out.println("春季");
                break;
            case 6, 7, 8:
                System.out.println("夏季");
                break;
            case 9, 10, 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("月份不存在");
        }

        // 新特性
        switch (month){
            case 1, 2, 12 -> System.out.println("冬季");
            case 3, 4, 5 -> System.out.println("春季");
            case 6, 7, 8 -> System.out.println("夏季");
            case 9, 10, 11 ->System.out.println("秋季");
            default -> System.out.println("月份不存在");
        }
    }
}
