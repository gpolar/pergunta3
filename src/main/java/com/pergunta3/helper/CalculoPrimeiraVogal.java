package com.pergunta3.helper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.pergunta3.api.FuncoesVogal;
import com.pergunta3.constant.Constantes;

/**
 * Classe que tem a logica para implementar calculo da primeira vogal
 * 
 * @author: Gustavo Polar gpolars@gmail.com, contact@gustavopolarsa.com
 */
public class CalculoPrimeiraVogal {

	public static String obterPrimeiraVogal(FuncoesVogal vogal) {

		// Primeiro faz uma consulta dos 3 primeras letrar assim valida que
		// possa ter algum resultado
		String retorno = Constantes.MSG_SEM_RESULTADO;
		Character primerValor = vogal.hasNext() ? vogal.getNext() : null;
		Character valorMeio = vogal.hasNext() ? vogal.getNext() : null;
		Character valorSeguinte = vogal.hasNext() ? vogal.getNext() : null;
		List<Character> possiveisValores = new ArrayList<>();

		// Ele calcula os possiveis resultados
		while (vogal.hasNext()) {
			if (Constantes.VOCAIS.indexOf(primerValor) != -1 && Constantes.VOCAIS.indexOf(valorMeio) == -1
					&& Constantes.VOCAIS.indexOf(valorSeguinte) != -1) {
				possiveisValores.add(valorSeguinte);
			}
			primerValor = valorMeio;
			valorMeio = valorSeguinte;
			valorSeguinte = vogal.getNext();
		}

		// Depois valida se esses resultados são repetidos fazendo um count e
		// retorna um LinkedHashMap para seguir o ordem dos resultados
		Map<Object, Long> group = possiveisValores.stream().collect(Collectors.groupingBy(po -> po, LinkedHashMap::new,
				Collectors.mapping(Function.identity(), Collectors.counting())));

		//Verifica o primer resultado e retorna uma mensagem com a vogal
		for (Map.Entry<Object, Long> map : group.entrySet()) {
			if (map.getValue() == 1) {
				retorno = String.format(Constantes.MSG_EXITO, map.getKey());
				break;
			}
		}
		//Se nao encontra nada retorna a mensagem estabelecida pela constante
		return retorno;

	}

}
