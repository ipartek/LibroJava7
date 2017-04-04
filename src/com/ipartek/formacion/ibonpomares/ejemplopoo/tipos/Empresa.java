package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.util.Arrays;

public class Empresa {

	
	
	public Empresa(){
		
	}
	
	private String nombreEmpresa;
	private String nombreEmpleado;
	private static String nombreDirector = "Ibon";
	
	
	private Junta junta = new Junta();
	
	public Junta getJuntas(){
		
		return junta;
	}

//	public void setJunta(Junta junta){
//		
//		this.junta = junta;
//	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public static String getNombreDirector() {
		return nombreDirector;
	}

	public static void setNombreDirector(String nombreDirector) {
		Empresa.nombreDirector = nombreDirector;
	}

	public Junta getJunta() {
		return junta;
	}

	public void setJunta(Junta junta) {
		this.junta = junta;
	}
				

		
	
	
}
