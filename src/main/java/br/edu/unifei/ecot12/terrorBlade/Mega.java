package br.edu.unifei.ecot12.terrorBlade;

public abstract class Mega extends Monstro {
	private Monstro monstro;
	public Mega(Monstro monstro) {
		this.monstro = monstro;
	}
	public Monstro getMonstro() {
		return monstro;
	}
	public void setMonstro(Monstro monstro) {
		this.monstro = monstro;
	}
	@Override
	public int abate() {
		// TODO Auto-generated method stub
		return monstro.abate();
	}

}
