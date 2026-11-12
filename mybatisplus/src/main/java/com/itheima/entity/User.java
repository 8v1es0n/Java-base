package com.itheima.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户实体类
 */
@TableName("user") // 指定当前实体对应的数据库表名
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
}
