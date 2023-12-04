package br.edu.ifsc.flm.domain;

public class Produto {
	
	private int id;
	private String nome;
	private int quantidade;
	private double preco;
	private double taxaLucro;
	
	
	
	public Produto() {
		super();
	}
	public Produto(int id, String nome, int quantidade, double preco, double taxaLucro) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.taxaLucro = taxaLucro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getTaxaLucro() {
		return taxaLucro;
	}
	public void setTaxaLucro(double taxaLucro) {
		this.taxaLucro = taxaLucro;
	}
	
	public double calcularprecoVenda() {
		return preco +(preco*taxaLucro/100);
	}
	

}
