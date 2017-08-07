@file:JvmName("Cosa")
package io.github.juanlucod.test_java2kotlin


data class Cosa(var valor: String?) {

	
	fun formatValor(): String? {
		return "Este es el valor: ${valor} "
	}
	
	fun showTipos(): String{
		var tipos: String = ""
				
		for(tipo:TipoCosa in TipoCosa.values()) {
			tipos = tipos + " " + tipo.name
		}
		return tipos
	}
}