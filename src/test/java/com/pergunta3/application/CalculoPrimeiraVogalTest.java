package com.pergunta3.application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pergunta3.helper.CalculoPrimeiraVogal;
import com.pergunta3.impl.Vogal;

public class CalculoPrimeiraVogalTest {

	public static final String MSG_SEM_RESULTADO = "Não Foi Encontrado nemhum registro";
	public static final String MSG_EXITO = "A primeira vogal sem repetir é %s";
	
    @Test
    public void primerCaracterNaoRepetido() throws Exception {
        final String characterOptional = CalculoPrimeiraVogal.obterPrimeiraVogal(new Vogal("AABBABacafe"));
        assertEquals(characterOptional, String.format(MSG_EXITO,'E'));
    }
    
    @Test
    public void naoFoiEncontradoResultados() throws Exception {
        final String characterOptional = CalculoPrimeiraVogal.obterPrimeiraVogal(new Vogal("AABBABaca"));
        assertEquals(characterOptional, MSG_SEM_RESULTADO);
    }
	
}
