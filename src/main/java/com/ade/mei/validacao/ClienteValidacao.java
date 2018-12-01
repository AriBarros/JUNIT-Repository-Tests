package com.ade.mei.validacao;

public class ClienteValidacao {
	
	public boolean validarCpf(String cpf) {
		
		if(cpf.contains("^[a-Z]")) return false;
		
		return true;
	
	}
	
	public boolean validarCpfComMenosDeOnzeDigitos(String cpf) {
		
		if(cpf.length() > 11) return false;
		
		return true;
	
	}
	
	

}
