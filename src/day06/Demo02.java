package day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("001", "林冲");
        map.put("004", "呼延灼");
        map.put("002", "秦明");
        map.put("003", "董平");

        System.out.println("======== 遍历方式一 ========");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
            System.out.println("----------");
        }

        System.out.println("======== 遍历方式二 ========");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("----------");
        }

        System.out.println("======== 遍历方式二 ========");
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
            System.out.println("----------");
        });
    }
}
