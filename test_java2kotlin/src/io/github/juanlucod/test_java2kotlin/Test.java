package io.github.juanlucod.test_java2kotlin;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cosa cosa = new Cosa("prueba");
		
		System.out.println(cosa.formatValor());
		
		cosa.setValor("prueba2");
		
		System.out.println(cosa.getValor());
		
		System.out.println(cosa.showTipos());
	}

}
