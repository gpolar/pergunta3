package com.pergunta3.application;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.pergunta3.api.FuncoesVogal;
import com.pergunta3.constant.Constantes;

/**
 * Classe que tem a logica para implementar  calculo da primeira vogal
 * 
 * @author: Gustavo Polar gpolars@gmail.com, contato@gustavopolarsa.com
 */
public class CalculoPrimeiraVogal {

	public static String obterPrimeiraVogal(FuncoesVogal vogal){
		
		String retorno = Constantes.MSG_SEM_RESULTADO;
		Character primerValor = vogal.hasNext() ? vogal.getNext() : null;
		Character valorMeio = vogal.hasNext() ? vogal.getNext() : null;
		Character valorSeguinte = vogal.hasNext() ? vogal.getNext() : null;
		List<Character> possiveisValores = new ArrayList<>();
				
		while(vogal.hasNext()){
			if( Constantes.VOCAIS.indexOf(primerValor)!=-1 && Constantes.VOCAIS.indexOf(valorMeio)==-1 && Constantes.VOCAIS.indexOf(valorSeguinte)!=-1){
				possiveisValores.add(valorSeguinte);
			}
			primerValor = valorMeio;
			valorMeio = valorSeguinte;
			valorSeguinte = vogal.getNext();
		}
		
		Map<Object, Long> group =
				possiveisValores.stream()
	                  .collect(Collectors.groupingBy(
	                		  po -> po,
	                          LinkedHashMap::new,
	                          Collectors.mapping(Function.identity(), Collectors.counting())
	                  ));
				
		for (Map.Entry<Object, Long> map : group.entrySet()) {
			if(map.getValue() == 1){
				retorno = String.format(Constantes.MSG_EXITO, map.getKey());
				break;
			}
		}
		return retorno;
		
	}
	
}
