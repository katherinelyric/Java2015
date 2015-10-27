package br.univel.cadastro;

public enum Uf {
	PR("Paraná"), //
	RJ("Rio de Janeiro"), //
	SC("Santa Catarina"),//
	BA("Bahia");
	
	private String uf;
	
	public String getUf(){
		return uf;
	}

	private Uf(String uf) {
		this.uf = uf;
	}
	
}
