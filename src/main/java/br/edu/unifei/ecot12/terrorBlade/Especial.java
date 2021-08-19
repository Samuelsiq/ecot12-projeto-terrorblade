package br.edu.unifei.ecot12.terrorBlade;

public class Especial implements Custo {
	double m;
	private String ocasiao; 
	public String getOcasiao() {
		return ocasiao;
	}
	public void setOcasiao(String ocasiao) {
		this.ocasiao = ocasiao;
	}
	public double custoHabilidade(float mana) {
		m= mana *0.8;
		return m;
	}

}
