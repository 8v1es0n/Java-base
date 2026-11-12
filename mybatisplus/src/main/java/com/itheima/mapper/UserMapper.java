package com.itheima.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface UserMapper extends BaseMapper<User> {

    @Insert("insert into user(username, password, age) values (#{username},#{password}, #{age})")
    void insertUser(User user);

    @Select("select age, count(1) as nums from user group by age")
    List<Map<Integer, String>> countAge();

    List<User> selectByNameAndAge(String name, Integer age);

    List<User> selectBYUser(User user);
}
