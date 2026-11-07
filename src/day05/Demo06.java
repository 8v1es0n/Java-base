package day05;

import java.util.ArrayList;

public class Demo06 {
    public static void main(String[] args) {
    /*
    集合
        public ArrayList<泛型>()  创建一个空的集合对象
            泛型:限定集合中装载数据的类型(注意: 这里只能是引用类型)
    常用方法
        boolean add(E e)：添加元素
        void add(int index,E e) 在指定位置插入指定的元素
        E set(int index,E e) ：修改指定索引处的元素
        E get(int index) ：返回指定索引处的元素
        boolean contains(Object obj)：判断集合中是否包含指定元素
        int size()：返回集合中元素的个数
        boolean remove(E e)：删除指定的元素 (如有重复删除第一个)
        E remove(int index)：删除指定索引处的元素
        void clear()：清空集合
    */
    // public ArrayList<泛型>()  创建一个空的集合对象
        ArrayList<String> list = new ArrayList<>();

        // boolean add(E e)：添加元素
        list.add("张飞");
        list.add("关羽");
        list.add("刘备");
        list.add("张飞");
        System.out.println(list);

        // void add(int index,E e) 在指定位置插入指定的元素
        list.add(1, "诸葛亮");

        // E set(int index,E e) ：修改指定索引处的元素
        list.set(2, "孙权");

        // E get(int index) ：返回指定索引处的元素
        System.out.println(list.get(2));

        // boolean contains(Object obj)：判断集合中是否包含指定元素
        System.out.println(list.contains("李白"));
        System.out.println(list.contains("张飞"));

        // int size()：返回集合中元素的个数
        System.out.println(list.size());

        // boolean remove(E e)：删除指定的元素 (如有重复删除第一个)
        list.remove("张飞");
        list.remove(3);

        // void clear()：清空集合
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
