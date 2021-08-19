package br.edu.unifei.ecot12.terrorBlade;

public class Fisico extends Poder {
	public Fisico(Custo custo) {
		super(custo);
		// TODO Auto-generated constructor stub
	}
	private int tempo;
	private int dano;

	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	
	
}
