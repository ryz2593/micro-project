package com.microservice.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ryz2593
 */
@SpringBootApplication
@MapperScan("com.microservice.user.mapper")
@EnableFeignClients
public class MicroUserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroUserServerApplication.class, args);
	}

}
