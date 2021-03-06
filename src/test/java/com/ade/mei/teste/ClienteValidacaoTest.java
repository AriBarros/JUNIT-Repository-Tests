package com.ade.mei.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ade.mei.validacao.ClienteValidacao;

import br.edu.ifal.servico.ServicoValidacao;
import junit.framework.Assert;

public class ClienteValidacaoTest {

	@Test
	public void validarCpf() {
		
		String cpf = "08119332181";
	
		
		ClienteValidacao servico = new ClienteValidacao();
		boolean validacaoDoCpfRetornada = servico.validarCpf(cpf);
		Assert.assertEquals(true, validacaoDoCpfRetornada);
			
	}
	
	public void naoValidarCpfComLetras() {
		
		String cpf = "0811a332181";
	
		
		ClienteValidacao servico = new ClienteValidacao();
		boolean validacaoDoCpfRetornada = servico.validarCpf(cpf);
		Assert.assertEquals(false, validacaoDoCpfRetornada);
			
	}
	
	public void naoValidarCpfComVariosDigitos() {
		
		String cpf = "0811123533218123131";
	
		
		ClienteValidacao servico = new ClienteValidacao();
		boolean validacaoDoCpfRetornada = servico.validarCpf(cpf);
		Assert.assertEquals(false, validacaoDoCpfRetornada);
			
	}

}
