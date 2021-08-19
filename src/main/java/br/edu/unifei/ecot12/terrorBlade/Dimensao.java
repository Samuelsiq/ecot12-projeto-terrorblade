package br.edu.unifei.ecot12.terrorBlade;

import java.util.*;

public class Dimensao {
	private String nome;
	private Date tempo;
	private List<Local> locais = new ArrayList<Local>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getTempo() {
		return tempo;
	}
	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}
	public List<Local> getLocais() {
		return locais;
	}
	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	
}
