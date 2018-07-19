package com.ryan.springboot.core.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * datesource 配置
 *
 * @author ruanzz
 * @create 2018-07-15 2:44 PM
 **/
@Configuration
@MapperScan(basePackages = {"com.ryan.springboot.dao"})
public class MysqlDataSourceConfig {

    /**
     * 使用 Druid
     *
     * @return
     */
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

}
