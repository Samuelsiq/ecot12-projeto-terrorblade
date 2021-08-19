package br.edu.unifei.ecot12.terrorBlade;

public class Catapulta extends Mega {
	private int velocidade;
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public Catapulta(Monstro monstro) {
		super(monstro);
		// TODO Auto-generated constructor stub
	}
	public int abate() {
		int g = super.abate() + getEspolio();
		return g*5;
	}

}
