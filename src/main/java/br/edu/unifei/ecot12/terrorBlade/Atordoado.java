package br.edu.unifei.ecot12.terrorBlade;

public class Atordoado implements Estado {
	
	private int tempo;
	public void mudarEstado(Ser s) {
		// TODO Auto-generated method stub

		
		try {
			Thread.sleep(tempo*1000);
			s.setEstado(new Comum());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

}
