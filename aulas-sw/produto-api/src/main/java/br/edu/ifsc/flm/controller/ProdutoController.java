package br.edu.ifsc.flm.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsc.flm.DataSource.ProdutoDataSource;
import br.edu.ifsc.flm.domain.Produto;
import br.edu.ifsc.flm.dto.ProdutoDTO;

@RestController
public class ProdutoController {
	
	@RequestMapping(value = "/produto/{id}/{nome}/{quantidade}/{preco}/{taxaLucro}")
	public Produto adicionarProduto( 
			@PathVariable("id") int id,
			@PathVariable("nome") String nome, 
			@PathVariable("quantidade") int quantidade, 
			@PathVariable("preco") double preco,
			@PathVariable("taxaLucro") double taxaLucro){
		         Produto produto = new Produto(id, nome, quantidade, preco, taxaLucro);
		         ProdutoDataSource.novo(produto);
		         return produto;
				
			}
	
	@RequestMapping(value = "/novo_produto_post", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Produto criarProduto(@RequestBody Produto produto) {
		ProdutoDataSource.novo(produto);
		return produto;
	}
	
	@RequestMapping(value = "/produtos")
	public List<Produto> getProdutos(){
		return ProdutoDataSource.getlistaProdutos();
	}
	
	@RequestMapping(value = "/produtos_dto")
	public List<ProdutoDTO> getProdutosDTO(){
		return ProdutoDataSource.getListaProdutosDTO();
	}
	
	@RequestMapping(value = "/porduto_por_id/{id}")
	public Produto getPorduto(@PathVariable int id) {
		return ProdutoDataSource.getProdutoPorId(id);
	}
	

}
