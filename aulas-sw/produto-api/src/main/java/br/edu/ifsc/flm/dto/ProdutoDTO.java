package br.edu.ifsc.flm.dto;

public class ProdutoDTO {
	private String nome;
	private int quantidade;
	private double precoVenda;
	
	
	
	public ProdutoDTO(String nome, int quantidade, double precoVenda) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoVenda = precoVenda;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
}
