package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.util.Arrays;

public class Junta {

	
	private String departemento;

	

private PersonaEmpresa[] persona = new PersonaEmpresa[5];
	
public PersonaEmpresa[] getPersonaEmpresas(){
	
	return persona;
}

public void setPersonaEmpresa(PersonaEmpresa[] persona){
	
	this.persona = persona;
}
	
	public Junta(){
		super();
		this.departemento= "Dep1";
	}

	@Override
	public String toString() {
		return "Junta [departemento=" + departemento + ", persona=" + Arrays.toString(persona) + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
