package br.edu.unifei.ecot12.terrorBlade;

public class Guerreiro extends Monstro {
	private int ataque;
	@Override
	public int abate() {
		// TODO Auto-generated method stub
		return getEspolio();
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

}
