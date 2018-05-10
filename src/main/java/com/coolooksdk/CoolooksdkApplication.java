package com.coolooksdk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.coolooksdk.dao")
public class CoolooksdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolooksdkApplication.class, args);
	}
}
