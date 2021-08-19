package br.edu.unifei.ecot12.terrorBlade;

import java.util.*;

public class Local {
	private String nome;
	private String descricao;
	private Dimensao dimensao;
	private List<Lei> leis = new ArrayList<Lei>();

	
	public List<Lei> getLeis() {
		return leis;
	}
	public void setLeis(List<Lei> leis) {
		this.leis = leis;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	
}
