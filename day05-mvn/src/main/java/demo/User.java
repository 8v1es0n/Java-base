package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 相当于帮你写了getter/setter/toString/equals/hashCode方法
@NoArgsConstructor // 无参构造方法
@AllArgsConstructor // 全参构造方法
class User{
    private String name;
    private int age;
}
