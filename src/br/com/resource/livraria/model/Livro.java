package br.com.resource.livraria.model;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	private String titulo;
	private String autor;
	private int ano;
	private double preco;
	private String genero;
	
	public Livro() {}
	
	public Livro(String titulo, String autor, int ano, double preco, String genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.preco = preco;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
