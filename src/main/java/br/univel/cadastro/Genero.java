package br.univel.cadastro;
/**
 * 
 * @author Danii
 *
 */
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
