package br.edu.ifsc.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifsc.flm.DataSource.ProdutoDataSource;

@SpringBootApplication
public class ProdutoApiApplication {

	public static void main(String[] args) {
		ProdutoDataSource.criarLista();
		SpringApplication.run(ProdutoApiApplication.class, args);
	}

}
