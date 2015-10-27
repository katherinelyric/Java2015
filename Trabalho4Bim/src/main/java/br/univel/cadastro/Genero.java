package br.univel.cadastro;

public enum Genero {
	Fem ("Feminino"),//
	Masc ("Masculino"); 
	
	private String gen;
	
	public String getGen(){
		return gen;
	}
	
	private Genero(String gen){
		this.gen = gen;
	}
	

}
