package com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos;

/**
 * Este es un interface de demostraci�n de c�mo funcionan los interfaces
 * 
 * @author javierlete
 */
public interface Contrato {
	/**
	 * Este m�todo no necesita ning�n valor
	 */
	void clausula1();

	/**
	 * Este m�todo trabaja con un argumento y devuelve un valor
	 * 
	 * @param s
	 *            texto que se introduce
	 * @return devuelve un entero
	 */
	int clausula2(String s);
}
