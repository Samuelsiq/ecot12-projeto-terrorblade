package br.edu.unifei.ecot12.terrorBlade;

public abstract class Poder {

	private String nome;
	private String descricao;
	private boolean ignoraImunidade ;
	private Custo custo;
	private float mana;
	public float getMana() {
		return mana;
	}
	public void setMana(float mana) {
		this.mana = mana;
	}
	public Custo getCusto() {
		return custo;
	}
	public void setCusto(Custo custo) {
		this.custo = custo;
	}
	public Poder(Custo custo) {
		this.custo = custo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isIgnoraImunidade() {
		return ignoraImunidade;
	}
	public void setIgnoraImunidade(boolean ignoraImunidade) {
		this.ignoraImunidade = ignoraImunidade;
	}
	public double taxa() {
		return custo.custoHabilidade(mana);
	}
	
	
}
