package br.edu.unifei.ecot12.terrorBlade;

public class Mago extends Mega {
	private int distancia;
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public Mago(Monstro monstro) {
		super(monstro);
		// TODO Auto-generated constructor stub
	}
	public int abate() {
		int g = super.abate() + getEspolio();
		return g*2;
	}
}
