package com.example.login;

import com.example.login.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
