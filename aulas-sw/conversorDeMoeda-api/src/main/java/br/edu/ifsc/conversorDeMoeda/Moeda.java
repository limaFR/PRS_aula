package br.edu.ifsc.conversorDeMoeda;

public class Moeda {
	
	private String tipo;
	private double taxaDeCompra;
	private double taxaDeVenda;
	
	
	public Moeda() {
		super();
	}
	
	
	public Moeda(String tipo, double taxaDeCompra, double taxaDeVenda) {
		super();
		this.tipo = tipo;
		this.taxaDeCompra = taxaDeCompra;
		this.taxaDeVenda = taxaDeVenda;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getTaxaDeCompra() {
		return taxaDeCompra;
	}
	public void setTaxaDeCompra(double taxaDeCompra) {
		this.taxaDeCompra = taxaDeCompra;
	}
	public double getTaxaDeVenda() {
		return taxaDeVenda;
	}
	public void setTaxaDeVenda(double taxaDeVenda) {
		this.taxaDeVenda = taxaDeVenda;
	}
	
	

}
