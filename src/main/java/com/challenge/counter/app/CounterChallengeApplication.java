package com.challenge.counter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.challenge.counter.config.JPAConfig;
import com.challenge.counter.config.WebMvcConfig;

@SpringBootApplication
@ComponentScan("com.challenge.*")
@Import({
	WebMvcConfig.class,
	JPAConfig.class
})
public class CounterChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterChallengeApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(CounterChallengeApplication.class);
	}
}
