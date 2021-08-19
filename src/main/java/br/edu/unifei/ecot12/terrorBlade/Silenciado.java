package br.edu.unifei.ecot12.terrorBlade;

public class Silenciado implements Estado {
	private int tempo;
	private boolean dissipavel;
	public void mudarEstado(Ser s) {
		// TODO Auto-generated method stub
		if (s.getCampeao().getEquipamentos()!=null && dissipavel){
			s.setEstado(new Comum());
		}else {
			try {
				Thread.sleep(tempo*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.setEstado(new Comum());
		}
		
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public boolean isDissipavel() {
		return dissipavel;
	}
	public void setDissipavel(boolean dissipavel) {
		this.dissipavel = dissipavel;
	}

}
