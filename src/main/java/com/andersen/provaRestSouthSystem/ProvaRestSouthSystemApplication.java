package com.andersen.provaRestSouthSystem;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class ProvaRestSouthSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaRestSouthSystemApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		return init();
	}

	@Bean
	CommandLineRunner init(ContaRepository repository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11)
					.mapToObj(i -> {
						Conta c = new Conta();
						c.setNumero("Numero " + i);
						c.setEmail("Agencia" + i);
						c.setCpf("014322660-63");
						return c;
					})
					.map(v -> repository.save(v))
					.forEach(System.out::println);
		};
	}
}