package br.edu.unifei.ecot12.terrorBlade;

public class Abencoado implements Estado {
	
	private int tempo;
	private TipoEnum tipoBencao;
	private int potencia;
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public TipoEnum getTipoBencao() {
		return tipoBencao;
	}
	public void setTipoBencao(TipoEnum tipoBencao) {
		this.tipoBencao = tipoBencao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public void mudarEstado(Ser s) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(tempo*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.setEstado(new Comum());
	}

}
