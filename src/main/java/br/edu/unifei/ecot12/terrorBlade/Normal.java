package br.edu.unifei.ecot12.terrorBlade;

public class Normal implements Custo {
	double m;
	public double custoHabilidade(float mana) {
		m = mana*0.2;
		return m;
	}

}
