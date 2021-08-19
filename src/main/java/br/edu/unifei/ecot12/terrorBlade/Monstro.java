package br.edu.unifei.ecot12.terrorBlade;

public abstract class Monstro extends Ser {
	private int espolio;
	public abstract int abate();
	public int getEspolio() {
		return espolio;
	}
	public void setEspolio(int espolio) {
		this.espolio = espolio;
	}
}
