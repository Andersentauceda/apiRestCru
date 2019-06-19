package com.andersen.provaRestSouthSystem;

import com.andersen.provaRestSouthSystem.model.Conta;
import com.andersen.provaRestSouthSystem.repository.ContaRepository;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class ProvaRestSouthSystemApplication {

	public static void main(String[] args) {
		run(ProvaRestSouthSystemApplication.class, args);
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
						c.setAgencia("Agencia" + i);
						c.setCpf("014322660-63");
						return c;
					})
					.map(v -> repository.save(v))
					.forEach(System.out::println);
		};
	}
}