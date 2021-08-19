package br.edu.unifei.ecot12.terrorBlade;

public class Roshan extends Ser {
	private int contaMorte;
	private static Roshan instancia = new Roshan();
	
	private Roshan() {}

	public int getContaMorte() {
		return contaMorte;
	}

	public void contaMorte() {
		contaMorte += 1;
	}

	public static Roshan getInstancia() {
		return instancia;
	}

	
	
	
}
