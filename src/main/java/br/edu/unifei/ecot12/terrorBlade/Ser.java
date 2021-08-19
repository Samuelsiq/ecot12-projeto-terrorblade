package br.edu.unifei.ecot12.terrorBlade;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
	private String nome;
	private String sexo;
	private String cor;
	private int manaTotal;
	private Dimensao dimensao;
	private List<Linguagem> linguagem = new ArrayList<Linguagem>();
	private List<Crime> crimes = new ArrayList<Crime>();
	private List<Luta> lutas = new ArrayList<Luta>();
	private Ser original;
	private Campeao campeao;
	private Estado estado = new Comum();
	public void alteracaoEstado() {
		estado.mudarEstado(this);
	}
	public int getManaTotal() {
		return manaTotal;
	}
	public void setManaTotal(int manaTotal) {
		this.manaTotal = manaTotal;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	
	public List<Linguagem> getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(List<Linguagem> linguagem) {
		this.linguagem = linguagem;
	}
	public List<Crime> getCrimes() {
		return crimes;
	}
	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}
	public List<Luta> getLutas() {
		return lutas;
	}
	public void setLutas(List<Luta> lutas) {
		this.lutas = lutas;
	}
	public Ser getOriginal() {
		return original;
	}
	public void setOriginal(Ser original) {
		this.original = original;
	}
	public Campeao getCampeao() {
		return campeao;
	}
	public void setCampeao(Campeao campeao) {
		this.campeao = campeao;
	}
	
	


}
