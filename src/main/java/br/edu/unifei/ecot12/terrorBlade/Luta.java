package br.edu.unifei.ecot12.terrorBlade;

import java.util.*;

public class Luta extends Evento {
	private LadoEnum vencedor;
	private List<Ser> seres = new ArrayList<Ser>();
	public LadoEnum getVencedor() {
		return vencedor;
	}

	public List<Ser> getSeres() {
		return seres;
	}

	public void setSeres(List<Ser> seres) {
		this.seres = seres;
	}

	public void setVencedor(LadoEnum vencedor) {
		this.vencedor = vencedor;
	}
	
}
