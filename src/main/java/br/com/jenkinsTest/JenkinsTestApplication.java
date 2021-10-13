package br.com.jenkinsTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class JenkinsTestApplication {

	@PostConstruct
	void init(){
		log.info("Application Stated!...");
	}

	public static void main(String[] args) {
		log.info("Application Executed!...");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
