package br.com.resource.livraria.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.resource.livraria.model.Livro;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();
	private static List<Livro> livros = new ArrayList<>();

	public Livro getLivro() {
		return livro;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void grava() {
//		Livro novoLivro = new Livro(this.livro.getTitulo(), this.livro.getAutor(), this.livro.getAno(),
//				this.livro.getPreco(), this.livro.getGenero());

		LivroBean.livros.add(new Livro(this.livro.getTitulo(), this.livro.getAutor(), this.livro.getAno(),
				this.livro.getPreco(), this.livro.getGenero()));
		this.livro = new Livro();
	}
}
