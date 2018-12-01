package com.ade.mei.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ade.mei.validacao.CategoriaValidacao;

import br.edu.ifal.servico.ServicoValidacao;
import junit.framework.Assert;

public class CategoriaValidacaoTest {

	@Test
	public void validarNome() {
		
		//int id = 1;
		String nome = "Jogos";
		
		CategoriaValidacao servico = new CategoriaValidacao();
		boolean validacaoDaCategoriaRetornada = servico.validarNome(nome);
		Assert.assertEquals(true, validacaoDaCategoriaRetornada);
			
	}
	
	@Test
	public void naoValidarNomeComNumeros() {
		
		//int id = 1;
		String nome = "El3trônicos";
		
		CategoriaValidacao servico = new CategoriaValidacao();
		boolean validacaoDaCategoriaRetornada = servico.validarNome(nome);
		Assert.assertEquals(false, validacaoDaCategoriaRetornada);
			
	}

}
