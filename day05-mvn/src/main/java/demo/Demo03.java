package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        // 初始化数据
        List<Employ> employees = new ArrayList<>();
        employees.add(new Employ("张三", 28, 9500, "技术部"));
        employees.add(new Employ("李四", 32, 15000, "技术部"));
        employees.add(new Employ("王五", 45, 18000, "技术部"));
        employees.add(new Employ("赵六", 26, 7500, "市场部"));
        employees.add(new Employ("孙七", 38, 12000, "市场部"));
        employees.add(new Employ("周八", 29, 6800, "市场部"));
        employees.add(new Employ("吴九", 41, 11000, "人事部"));
        employees.add(new Employ("郑十", 33, 9200, "人事部"));
        employees.add(new Employ("陈十一", 27, 13500, "技术部"));
        employees.add(new Employ("林十二", 36, 10500, "人事部"));
        employees.add(new Employ("黄十三", 30, 8800, "财务部"));
        employees.add(new Employ("刘十四", 42, 16000, "财务部"));



        // 筛选出薪资大于 10000 的员工
        // 按薪资降序排序
        // 跳过前 2 名，取接下来 3 名员工, 并将这 3 名员工的姓名收集到一个新的 List 中并输出
        employees.stream().filter(s -> s.getSalary() > 10000)
                .sorted(Comparator.comparingDouble(Employ::getSalary).reversed())
                .skip(2).limit(3).toList().forEach(System.out::println);
    }
}
