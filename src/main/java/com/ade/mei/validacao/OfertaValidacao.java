package com.ade.mei.validacao;

public class OfertaValidacao {
	
	public boolean validarPreco(String preco) {
		
		if(preco.contains("-")) return false;
	
		return true;
	}
	
	public boolean validarPrecoVazio(String preco) {
		
		if(preco.contains(" ")) return false;
	
		return true;
	}
	
	public boolean validarDisponibilidade(String disponibilidade) {
		
		if(disponibilidade.contains("N")) return false;
	
		return true;
	}
	
	
	
	

}
