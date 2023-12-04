package br.edu.ifsc.flm.DataSource;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsc.flm.domain.Produto;
import br.edu.ifsc.flm.dto.ProdutoDTO;


public class ProdutoDataSource {
	
	private static List<Produto> listaProdutos = new ArrayList<>();
	
	public static void criarLista() {
		listaProdutos.add(new Produto(1, "Arroz", 100, 2.0, 50.0 ));
		listaProdutos.add(new Produto(2, "Feijão", 50, 10.0, 20.0 ));
		listaProdutos.add(new Produto(3, "Óleo", 70, 15.0, 45.0 ));
		listaProdutos.add(new Produto(4, "Farinha", 100, 8.0, 50.0 ));
		listaProdutos.add(new Produto(5, "Vinagre", 40, 5.0, 50.0 ));
		
	}
	
	public static List<Produto> getlistaProdutos(){
		return listaProdutos;
	}
	
	public static List<ProdutoDTO> getListaProdutosDTO(){
		List<ProdutoDTO> produtosDTO =new ArrayList<>();
		for(Produto p : listaProdutos) {
			ProdutoDTO pDTO = new ProdutoDTO(p.getNome(), p.getQuantidade(), p.calcularprecoVenda());
			produtosDTO.add(pDTO);
		}
		return produtosDTO;
	}
	
	public static void novo(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public static Produto getProdutoPorId(int id) {
		for (Produto produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
			
		}
		return null;
	}
	

}
