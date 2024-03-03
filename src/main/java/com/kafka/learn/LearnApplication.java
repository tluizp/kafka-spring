package com.kafka.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication implements CommandLineRunner {

	@Value("${variavel.ambiente.teste}")
	private String teste;

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}

	private static final Logger log = LoggerFactory
			.getLogger(LearnApplication.class);

	@Override
	public void run(String... args) throws Exception {
		log.info("Variavel externa : {} ", teste);
	}

}
