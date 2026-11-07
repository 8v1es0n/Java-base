package day05.homework;

import java.util.*;

public class test {
    public static void main(String[] args) {
        // 选择题
        // 1 ~ 10: C B CD C B C C B B B
        // 11 ~ 20: C C C C B B C C A B


        // 编程题
        // 1.
        // 创建String类型ArrayList集合，添加元素："苹果"、"香蕉"、"橙子"、"葡萄"
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("苹果");
        fruit.add("香蕉");
        fruit.add("橙子");
        fruit.add("葡萄");
        System.out.println(fruit);
        System.out.println("============================");

        // 完成修改第二个元素为"芒果"、删除第一个元素、判断是否包含"橙子"、输出集合长度的操作
        fruit.set(1, "芒果");
        fruit.removeFirst();
        for (int f = fruit.size() - 1; f >= 0; f--) {
            if (fruit.get(f).equals("橙子")) {
                fruit.remove(f);
            }
        }
        System.out.println(fruit);
        System.out.println("集合长度: " + fruit.size());
        System.out.println("============================");


        // 2.
        // 创建存储学生对象的ArrayList集合，学生属性：姓名、年龄，添加3个学生对象，使用迭代器遍历输出所有学生信息
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("王强", 16));
        students.add(new Student("李明", 17));
        students.add(new Student("赵兴", 18));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");


        // 3.
        // 现有集合元素："华为手机"、"小米耳机"、"华为平板"、"苹果手机"、"华为手表"，
        // 批量删除所有包含“华为”的元素，使用迭代器方式实现
        List<String> list = new ArrayList<>(List.of("华为手机", "小米耳机", "华为平板", "苹果手机", "华为手表"));  // 可变，可继续 add
        for (int l = list.size() - 1; l >= 0; l--) {
            if (list.get(l).equals("华为")) {
                list.remove(l);
            }
        }
        System.out.println("============================");


        // 4.
        // 创建自定义Person类（姓名、年龄），重写hashCode和equals方法，
        // 向HashSet中添加2个属性完全相同的Person对象，验证去重效果，遍历输出集合元素
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("刘浩", 20));
        people.add(new Person("刘浩", 20));
        people.forEach(System.out::println);
        System.out.println("============================");


        /*
            6. 字符串处理-银行卡取款
            银行卡预设正确取款密码：802314
            功能要求：
                1. 控制台模拟 ATM 输密码界面，每次让用户输入 6 位数字密码；
                2. 密码输入正确，输出：密码验证通过，请选择取款业务，程序直接结束
                3. 密码输入错误时，提示错误并告知剩余尝试次数
                4. 银行卡最多提供3 次密码输入机会，3 次全部输错后，
                   输出：密码连续错误3次，银行卡已锁定，请前往柜台解锁，程序终止
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("========欢迎使用 ATM 系统========");
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入您的 6 位密码");
            String pw = sc.next();
            if (pw.equals("802314")) {
                System.out.println("---密码验证通过---");
            } else if (i == 2) {
                System.out.println("银行卡已锁定，请前往柜台解锁");
            } else {
                System.out.println("密码输入错误, 您还有 " + (2 - i) + "次机会");
            }
        }
    }
}
