package day05;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo08 {
    public static void main(String[] args) {
        //第 2 种方式: 使用迭代器循环实现============================
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.contains("枸杞")){
                iterator.remove(); //使用的迭代器自己的删除方法 而不是list的
            }
        }
        System.out.println(list);
    }
}
