package day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        //需求：创建HashMap集合, 然后向map中存入西游四人组的编号和姓名 001-玄奘  002-悟空  003-悟能  004-悟净

        //创建Map的对象
        Map<String,String> map = new HashMap<>();

        //V put(K key,V value)   添加元素
        map.put("001","玄奘");
        map.put("002","悟空");
        map.put("003","悟能");
        map.put("004","悟净");
        map.put("004","沙悟净");//当key是一样的时候, 就相当于值修改
        System.out.println(map);//{001=玄奘, 002=悟空, 003=悟能, 004=悟净1}

        //int size()    获取集合的大小
        System.out.println(map.size());//4

        //boolean isEmpty() 判断集合是否为空，为空返回true
        System.out.println(map.isEmpty());//false

        //V get(Object key) 根据键获取对应值
        String s = map.get("001");
        System.out.println(s);//玄奘

        //V remove(Object key)  根据键删除整个元素
        map.remove("001");
        System.out.println(map);//{002=悟空, 003=悟能, 004=悟净1}

        //boolean containsKey(Object key)     判断是否包含某个键
        System.out.println(map.containsKey("001"));//false

        //boolean containsValue(Object value)     判断是否包含某个值
        System.out.println(map.containsValue("悟空"));//true

        //Set<K> keySet()    获取全部键的集合
        Set<String> keys = map.keySet();
        System.out.println(keys);//[002, 003, 004]

        //Collection<V> values()     获取Map集合的全部值
        Collection<String> values = map.values();
        System.out.println(values);//[悟空, 悟能, 悟净1]

        //void clear()  清空集合
        map.clear();
        System.out.println(map.isEmpty());//true
        System.out.println(map.size());//0
        System.out.println(map);//{}
    }
}
