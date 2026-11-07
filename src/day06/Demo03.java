package day06;

import java.util.HashMap;

public class Demo03 {
    public static void main(String[] args) {
        String[] bookArr = {"《红楼梦》-曹雪芹","《西游记》-吴承恩","《三国演义》-罗贯中","《水浒传》-施耐庵"};
        HashMap<String, String> book = new HashMap<>();
        for (String b : bookArr) {
            String[] arr = b.split("-");
            book.put(arr[0].substring(1, arr[0].length() - 1), arr[1]);
        }

        book.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
