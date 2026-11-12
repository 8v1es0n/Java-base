package com.itheima.config;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    /**
     * 分页插件（3.5.x 最新版写法）
     * 分页拦截器配置一次即可，以后调用 MyBatis-Plus 的分页查询方法时，
     * 它就能帮助我们自动处理分页 SQL。配置代码不需要背，会复制、会使用即可。
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        //1) 创建MybatisPlusInterceptor拦截器对象
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        //2) 添加分页拦截器（指定数据库类型，性能更好）
        PaginationInnerInterceptor paginationInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        interceptor.addInnerInterceptor(paginationInterceptor);

        return interceptor;
    }
}
