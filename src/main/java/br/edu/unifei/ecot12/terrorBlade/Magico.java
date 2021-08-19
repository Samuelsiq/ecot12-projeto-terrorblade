package br.edu.unifei.ecot12.terrorBlade;

public class Magico extends Poder {
	public Magico(Custo custo) {
		super(custo);
		// TODO Auto-generated constructor stub
	}
	private int tempo;
	private int distancia;
	
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	
}
