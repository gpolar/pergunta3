package com.pergunta3.application;

import com.pergunta3.impl.Vogal;

public class Executar {

	public static String streamTest = "aAbBAefiBacafe";
	
	public static void main(String[] args) {
		System.out.println(CalculoPrimeiraVogal.obterPrimeiraVogal(new Vogal(streamTest)));
	}
	


}
