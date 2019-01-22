package br.com.resource.livraria.bean;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class GeneroBean {

	private String genero;
	private Map<String, String> items = new HashMap<>();

	@PostConstruct
	public void inicializar() {
		items.put("TR", "Terror");
		items.put("RM", "Romance");
		items.put("AC", "Ação");
	}

	public void mostrar() {
		System.out.println(genero);
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Map<String, String> getItems() {
		return items;
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}

}
