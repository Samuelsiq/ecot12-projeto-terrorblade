package br.edu.unifei.ecot12.terrorBlade;

import java.util.*;

public class Campeao {
	private	TipoEnum tipo;
	private LadoEnum lado;
	private String titulo;
	private List<Equipamento> equipamentos = new ArrayList<Equipamento>();
	private List<Poder> poderes = new ArrayList<Poder>();
	public TipoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}
	public LadoEnum getLado() {
		return lado;
	}
	public void setLado(LadoEnum lado) {
		this.lado = lado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	public List<Poder> getPoderes() {
		return poderes;
	}
	public void setPoderes(List<Poder> poderes) {
		this.poderes = poderes;
	}
	
	

}
