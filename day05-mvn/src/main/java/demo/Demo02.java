package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo02 {
    public static void main(String[] args) {
        // 选择题
        // 1.A  2.C 3.C 4.B 5.C 6.B 7.C 8.B 9.C

        // 创建一个集合，存储多个字符串元素
        // {"张三丰”, “张无忌”, “张翠山”, “王二麻子”, “张良”, “谢广坤”,“张三丰”}
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤","张三丰"));
        // 使用stream流把集合中重复的元素过滤掉，并进行打印
        list.stream().distinct().forEach(System.out::println);
        System.out.println("=============================");
        // 使用stream流把集合中"张"字开头且长度为3的元素筛选出来，并转成一个set集合遍历输出
        list.stream().filter(s -> s.length() == 3 && s.startsWith("张")).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
