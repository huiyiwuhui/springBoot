package com.wangxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBoot5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot5Application.class, args);
	}
}
