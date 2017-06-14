package com.pergunta3.application;

import com.pergunta3.impl.Vogal;

/**
 * Classe que tem o metodo main executar o metodo de obterPrimeiraVogal
 * 
 * @author: Gustavo Polar gpolars@gmail.com, contato@gustavopolarsa.com
 */
public class Executar {

	public static String streamTest = "aAbBAefiBacafe";
	
	public static void main(String[] args) {
		System.out.println(CalculoPrimeiraVogal.obterPrimeiraVogal(new Vogal(streamTest)));
	}
	


}
