package com.fastcampus.snsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
public class FastcampusSnsProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSnsProjectApplication.class, args);
    }

}
