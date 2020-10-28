package com.lsdSpringCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("com.lsdSpringCloud.dao")
public class LsdSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LsdSpringCloudApplication.class, args);
	}

}
