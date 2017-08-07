package io.github.juanlucod.test_java2kotlin;

public class CosaJava {

	CosaJava(String valor){
		this.valor = valor;
	}
	
	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	public String formatValor() {
		return "Este es el valor: ".concat(valor);
	}
	
	
}
