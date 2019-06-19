package com.andersen.provaRestSouthSystem;

import com.andersen.provaRestSouthSystem.model.Conta;
import com.andersen.provaRestSouthSystem.repository.ContaRepository;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class ProvaRestSouthSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = run(ProvaRestSouthSystemApplication.class, args);
	}

}