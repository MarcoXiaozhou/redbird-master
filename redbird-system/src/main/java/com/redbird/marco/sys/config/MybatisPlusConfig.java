//package com.redbird.marco.sys.config;
//
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @program: redbird-master
// * @description: 分页插件
// * @author: fanwz
// * @create: 2020-01-14 17:14
// **/
//@Configuration
//@MapperScan("com.redbird.marco.sys.dao")
//public class MybatisPlusConfig {
//    @Bean
//    public PaginationInterceptor paginationInterceptor(){
//        return new PaginationInterceptor().setCountSqlParser(new JsqlParserCountOptimize(true));
//    }
//}
