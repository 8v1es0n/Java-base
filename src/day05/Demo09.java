package day05;

import java.util.HashSet;

public class Demo09 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("武松");
        set.add("宋江");
        set.add("林冲");
        set.add("武松");
        System.out.println(set.contains("宋江"));
        System.out.println(set.contains("李逵"));

        set.remove("林冲");
        System.out.println(set);
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
        System.out.println(set.size());
    }
}
