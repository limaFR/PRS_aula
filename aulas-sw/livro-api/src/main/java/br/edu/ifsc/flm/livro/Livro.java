package br.edu.ifsc.flm.livro;

public class Livro {
	
	private int id;
	private int isbn;
	private String titulo;
	private String Autor;
	private String editor;
	private double preco;
	
	
	
	public Livro(int id, int isbn, String titulo, String autor, String editor, double preco) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		Autor = autor;
		this.editor = editor;
		this.preco = preco;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	

}
