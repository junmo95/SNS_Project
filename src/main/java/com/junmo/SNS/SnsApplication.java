package com.junmo.SNS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) 이 옵셥으로 JPA가 자동으로 데이터베이스 연결하는거 막음 <- 오류방지
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnsApplication.class, args);
	}

}
