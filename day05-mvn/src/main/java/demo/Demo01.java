package demo;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        copySingleFile();

        User user1 = new User("张三", 18);
        User user2 = new User("张三", 18);
        System.out.println(user1.getName());
        System.out.println(user1.getAge());
        System.out.println(user1);
        System.out.println(user1.equals(user2));


        ArrayList<String> list = new ArrayList<>();
        System.out.println("集合的状态: " + collIsNull(list));

       list.addAll(0, new ArrayList<>(List.of("黄药师", "冯蘅","郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏")));
       System.out.println("集合的状态: " + collIsNull(list));
       // 将以郭字开头的元素存入新数组，并打印
        Object[] arr = list.stream().filter(s -> s.startsWith("郭")).toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println("=============================");
        // 取出前2个元素并在控制台打印输出
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("=============================");
        // 取出后2个元素并在控制台打印输出
        list.stream().skip(list.size() - 2).forEach(System.out::println);
        System.out.println("=============================");
        // 统计名字三个字的人数
        long count = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);
    }

    private static void copySingleFile(){
        String srcpath = Paths.get("G:\\JYB\\stage-3\\Java-base\\day05-mvn\\src\\main\\java\\demo01\\a.txt").toString();
        String destpath = Paths.get("G:\\JYB\\stage-3\\Java-base\\day05-mvn\\src\\main\\java\\demo01\\b.txt").toString();

        FileUtil.copy(srcpath, destpath, true);
        System.out.println("单文件拷贝成功");

    }

    private static boolean collIsNull(List<String> list){
        return CollUtil.isEmpty(list);
    }
}
