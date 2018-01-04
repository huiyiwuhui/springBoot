package com.wangxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBoot4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);
	}
}
