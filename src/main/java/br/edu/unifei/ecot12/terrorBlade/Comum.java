package br.edu.unifei.ecot12.terrorBlade;

public class Comum implements Estado {

	public void mudarEstado(Ser s) {
		// TODO Auto-generated method stub
		if(s.getManaTotal()==0) {
			s.setEstado(new Atordoado());
		}
		
		if(s.getManaTotal()<=60 && s.getManaTotal()> 0) {
			s.setEstado(new Silenciado());
		}
		if(s.getManaTotal()>200) {
			s.setEstado(new Abencoado());
		}
	}

}
