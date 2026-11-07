package day06;

import java.util.ArrayList;
import java.util.Comparator;

public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String> minXin = new ArrayList<>();
        minXin.add("1刘德华");
        minXin.add("2赵今麦");
        minXin.add("7张凌赫");
        minXin.add("4张凌赫");
        minXin.add("1刘德华");

        // filter(Predicate<? super T> predicate)   根据 条件判断表达式 过滤元素
        minXin.stream().filter(s -> s.startsWith("赵"))
                .forEach(System.out::println);
        // limit(long maxSize)  限制取前几个元素
        minXin.stream().limit(3)
                .forEach(System.out::println);
        // skip(long n) 跳过前几个元素
        minXin.stream().skip(2)
                .forEach(System.out::println);
        // distinct()   去重,采用的Hash去重
        minXin.stream().distinct()
                .forEach(System.out::println);
        // sorted()自然排序
        minXin.stream().sorted()
                .forEach(System.out::println);
        // .sorted()逆向排序.distinct()去重
        minXin.stream().sorted(Comparator.reverseOrder()).distinct()
                .forEach(System.out::println);

        // map(Function<? super T,? extends R> mapper)  修改元素
        minXin.stream().map(s -> s.substring(1))
                .forEach(System.out::println);
    }
}
