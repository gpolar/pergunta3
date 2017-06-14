package com.pergunta3.impl;

import java.util.Objects;

import com.pergunta3.api.FuncoesVogal;
import com.pergunta3.constant.Constantes;

/**
 * Classe que implementa a logica dos metodos da interfase FuncoesVogal
 * 
 * @author: Gustavo Polar gpolars@gmail.com, contato@gustavopolarsa.com
 */
public class Vogal implements FuncoesVogal {

	private String palavraOuFrase;
	private Integer contadorPalavras = 0;

	public Vogal(String palavraOuFrase) {
		this.palavraOuFrase = Objects.isNull(palavraOuFrase) ? Constantes.VAZIO : palavraOuFrase.toUpperCase();
	}

	@Override
	public char getNext() {
		// TODO Auto-generated method stub
		try {
			return this.palavraOuFrase.charAt(contadorPalavras++);
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public boolean hasNext() {
		return contadorPalavras > this.palavraOuFrase.length() ? false : true;
	}

}
