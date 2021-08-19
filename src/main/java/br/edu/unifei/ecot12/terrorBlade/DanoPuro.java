package br.edu.unifei.ecot12.terrorBlade;

public class DanoPuro extends Poder {
	public DanoPuro(Custo custo) {
		super(custo);
		// TODO Auto-generated constructor stub
	}

	private int duracao;

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	/*public Ser criaClone() {
		Demonio d = new Demonio();
		return d;
	}*/
}
