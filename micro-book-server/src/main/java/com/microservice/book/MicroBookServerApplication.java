package com.microservice.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.microservice.book.mapper")
public class MicroBookServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroBookServerApplication.class, args);
	}

}
