package com.gilson.cursomc.dto;

import java.io.Serializable;

import com.gilson.cursomc.domain.Produto;

public class ProdutoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	private Double preco;
	
	public ProdutoDTO() {}

	public ProdutoDTO(Produto obj) {
		this.nome = obj.getNome();
		this.preco = obj.getPreco();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}