package com.ade.mei.validacao;

public class UsuarioValidacao {
	
	public boolean validarUsuario(String nome) {
		
		
		
		for (int i = 0; i < nome.length(); i++) {
	          if (!Character.isAlphabetic((nome.charAt(i)))) {
	              
	        	  if(!nome.contains(" "))
	        	   return false;
	          }
	     }
				
		return false;
	
	}
	
	public boolean validarEmail(String email) {
		
		
		if(email.contains("@")) return true;
		
		return false;
		
	}

}