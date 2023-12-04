package br.edu.ifsc.conversorDeMoeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorDeMoedaApiApplication {

	public static void main(String[] args) {
		ConversorDeMoedaDataSource.criarLista();
		SpringApplication.run(ConversorDeMoedaApiApplication.class, args);
	}

}
