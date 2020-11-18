package com.example.demo;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource myPostgresDb() {
        DataSourceBuilder dataSource = DataSourceBuilder.create();
        dataSource.driverClassName("org.postgresql.Driver");
        dataSource.url("jdbc:postgresql://34.126.85.20:5432/postgres");
        dataSource.username("postgres");
        dataSource.password("123");
        return dataSource.build();
    }

}
