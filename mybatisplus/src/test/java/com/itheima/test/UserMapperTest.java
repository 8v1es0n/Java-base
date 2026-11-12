package com.itheima.test;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.entity.User;
import com.itheima.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setId(12);
        user.setUsername("weidaxun");
        user.setPassword("weidaxun777");
        user.setName("魏大勋");
        user.setAge(34);
        int insert = userMapper.insert(user);
        System.out.println("受影响的结果: " + insert);
        System.out.println("插入的id: " + user.getId());
    }

    @Test
    public void testSelectById(){
        User user = userMapper.selectById(2118234114);
        System.out.println(user);
    }

    @Test
    public void testSelectByIds(){
        List<Integer> integers = List.of(1, 2, 3);
        List<User> users = userMapper.selectByIds(integers);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(2118234114);
        user.setName("wangqiang");
        user.setUsername("王强");
        user.setAge(23);
        int i = userMapper.updateById(user);
        System.out.println("执行的结果: " + i);
    }

    @Test
    public void testDeleteById(){
        int i = userMapper.deleteById(2118234114);
        System.out.println("执行的结果: " + i);
    }

    @Test
    public void testDeleteByIds(){
        List<Integer> integers = List.of(1, 2, 3);
        int i = userMapper.deleteByIds(integers);
        System.out.println("执行的结果: " + i);
    }

    @Test
    public void testSelectList2() {
        //0. 模拟传入参数
        String name = "张三";
        Integer age = null;

        //1. 封装查询条件
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        //只有第一个参数为true,才会拼接条件    where name='张三'
        wrapper.eq(StringUtils.isNotEmpty(name), User::getName, name)
                .eq(ObjectUtils.isNotEmpty(age), User::getAge, age);

        //2. 调用查询方法
        List<User> userList = userMapper.selectList(wrapper);
        System.out.println(userList);
    }

    @Test
    public void query(){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getName, "赵云").or()
                .between(User::getAge, 10, 20);

        List<User> users = userMapper.selectList(queryWrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void queryX(){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(User::getName, User::getAge);
        queryWrapper.orderByDesc(User::getAge);
        List<User> users = userMapper.selectList(queryWrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void queryPage(){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.gt(User::getId, 5);
        Page<User> userPage = new Page<>(2, 3);
        Page<User> selectPage = userMapper.selectPage(userPage, queryWrapper);
        System.out.println("总条数: " + selectPage.getTotal());
        System.out.println("总页数: " + selectPage.getPages());
        System.out.println("当前页数据: " + selectPage.getRecords());
    }

    @Test
    public void queryUpdate(){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getName, "唐僧");

        User user = new User();
        user.setAge(66);
        user.setPassword("piaorou");
        int update = userMapper.update(user, queryWrapper);
        System.out.println("受影响的行数: " + update);
    }

    @Test
    public void delete() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getId, 10);

        userMapper.delete(queryWrapper);
    }

    @Test
    public void zidingyi1(){
        // 创建用户对象
        User user = new User();
        user.setUsername("zhangtianqi");
        user.setPassword("123456");
        user.setAge(25);
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        userMapper.insertUser(user);
    }

    @Test
    public void countAge(){
        List<Map<Integer, String>> maps = userMapper.countAge();
        for (Map<Integer, String> map : maps) {
            System.out.println(map);
        }
    }

    @Test
    public void selectByNameAndAge(){
        List<User> users = userMapper.selectByNameAndAge("赵", 18);
        System.out.println(users);
    }

    @Test
    public void selectBYUser(){
        User user = new User();
        user.setId(11);
        List<User> users = userMapper.selectBYUser(user);
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void LambdaCheck(){
        User user = new User();
        user.setName("赵云");
        user.setAge(27);
        user.setUsername("zhaoyun");
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(user.getId() != null, User::getId, user.getId())
                .eq(StringUtils.isNotBlank(user.getUsername()), User::getUsername, user.getUsername())
                .eq(StringUtils.isNotBlank(user.getPassword()), User::getPassword, user.getPassword())
                .like(StringUtils.isNotBlank(user.getName()), User::getName, user.getName())
                .eq(user.getAge() != null, User::getAge, user.getAge());

        List<User> users= userMapper.selectList(queryWrapper);
        for (User u: users) {
            System.out.println(u);
        }
    }
}
