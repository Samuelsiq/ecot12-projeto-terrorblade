package br.edu.unifei.ecot12.terrorBlade;

public class App {

	public static void main(String[] args) {
		Normal n1 = new Normal();
		Fisico e = new Fisico(n1);
		e.setIgnoraImunidade(false);
		e.setNome("Metamorfose");
		e.setDescricao("Aumento de forca");
		e.setDano(100);
		e.setTempo(120);
		e.setMana(120);
	
		Normal n2 = new Normal();
		Magico q = new Magico(n2);
		q.setDescricao("Cria clones dos inimigos");
		q.setIgnoraImunidade(true);
		q.setNome("Reflexo");
		q.setDistancia(475);
		q.setTempo(10);
		q.setMana(60);
		
		Especial e1 = new Especial();
		e1.setOcasiao("quando estiver morrendo");
		DanoPuro r = new DanoPuro(e1);
		r.setDuracao(0);
		r.setDescricao("Troca de vida com o inimigo");
		r.setIgnoraImunidade(false);
		r.setNome("Sulcar");
		r.setMana(100);
		
		Equipamento y = new Equipamento();
		y.setNome("yasha");
		y.setAtributos(16);
		y.setGaranteImunidade(false);
		
		
		Campeao tb = new Campeao();
		tb.setLado(LadoEnum.TEMIDOS);
		tb.setTipo(TipoEnum.AGILIDADE);
		tb.setTitulo("O Demônio Saqueador");
		tb.getPoderes().add(q);
		tb.getPoderes().add(e);
		tb.getPoderes().add(r);
		tb.getEquipamentos().add(y);
		
		Lei lei = new Lei();
		lei.setNome("Roubo");
		
		
		Local l1 = new Local();
		l1.setDescricao("1 dos sete estados do inferno");
		l1.setNome("The abysm");
		l1.getLeis().add(lei);
		
		
		Dimensao dimensao = new Dimensao();
		dimensao.setNome("Dimensao demoniaca");
		dimensao.setTempo(null);
		dimensao.getLocais().add(l1);
		l1.setDimensao(dimensao);
		
		Crime f = new Crime();
		f.setData(null);
		f.setDescricao("Roubou o tesouro do abismo");
		f.setDimensao(dimensao);
		f.setTempo(5);
				
		
		Linguagem l = new Linguagem();
		l.setNome("Ozkavosh");
		l.setFonemas("OZS");
		l.setAlfabeto("a");
		
		
		Demonio d = new Demonio();
		d.setNome("TerrorBlade");
		d.setCampeao(tb);
		d.setCor("Roxo-avermelhado");
		d.setSexo("M");
		d.setFaccao("Lorde Demonio");
		d.getCrimes().add(f);
		d.getLinguagem().add(l);
		d.setDimensao(dimensao);
		d.setOriginal(d);
		d.setManaTotal(160);
		
		Luta luta =new Luta();
		luta.setVencedor(null);
		luta.setData(null);
		luta.setDimensao(dimensao);
		luta.getSeres().add(d);
		
		d.getLutas().add(luta);

		Evento nascimento = new Evento();
		nascimento.setDescricao("TerrorBlade nasceu");
		nascimento.setDimensao(dimensao);
		nascimento.setData(null);
		
		Roshan ro = Roshan.getInstancia();
		ro.contaMorte();
		
		Guerreiro g = new Guerreiro();
		g.setEspolio(100);
		g.setAtaque(10);
		
		Mago m = new Mago(g);
		m.setDistancia(450);
		m.setEspolio(500);
		
		Catapulta c = new Catapulta(m);
		c.setVelocidade(50);
		c.setEspolio(1000);
		
		
		
		
		System.out.println(d.getNome() + ", " + d.getCampeao().getTitulo()
				 			+ "\n Este ser tem um cor " + d.getCor() + " faz"
				 			+ " parte da faccao " + d.getFaccao() + "\n tem as"
				 			+ " Habilidades: ");
		int k=1;
		while(!d.getCampeao().getPoderes().isEmpty()) {			
			System.out.println(k + "-"+ d.getCampeao().getPoderes().get(0).getNome()+ "- custo: " +d.getCampeao().getPoderes().remove(0).taxa());
			k++;
		}
		System.out.println("Ele tem os itens: ");
		k=1;
		while(!d.getCampeao().getEquipamentos().isEmpty()) {			
			System.out.println(k + "-"+ d.getCampeao().getEquipamentos().remove(0).getNome());
			k++;
		}
		k=1;
		ro.contaMorte();
		System.out.println("Ele fala as linguas: ");
		while(!d.getLinguagem().isEmpty()) {			
			System.out.println(k + "-"+ d.getLinguagem().get(0).getNome() + ", com o fonema "+d.getLinguagem().get(0).getFonemas() + ", com o alfabeto " + d.getLinguagem().remove(0).getNome());
			k++;
		}
		System.out.println("Enquanto era descrito o TerrorBlade, O Roshan morreu: " + ro.getContaMorte() + " vezes");
		System.out.println("O estado do TerrorBlade agora é: " + d.getEstado());
		d.setManaTotal(0);
		d.alteracaoEstado();
		System.out.println("O estado do TerrorBlade agora é: " + d.getEstado());
		d.setManaTotal(400);
		d.alteracaoEstado();
		d.alteracaoEstado();
		System.out.println("O estado do TerrorBlade agora é: " + d.getEstado());
		
		System.out.println("TerrorBlade abateu uma catapulta e ganhou: " + c.abate() + " ouros");
	}
}
