package day06;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("赵今麦");
        list.add("张凌赫");
        list.add("刘德华");

        //将流转成集合后, 主要的目的可以使用集合的方法 toList()
        List<String> collect = list.stream()
                .filter(name -> name.startsWith("张"))
                .toList();

        List<String> list1 = list.stream().toList(); //这个有限制jdk16才有的功能

        //toArray()将流转成数组
        Object[] array = list.toArray();
        for (Object obj : array) {
            System.out.println(obj);
        }
    }

}
