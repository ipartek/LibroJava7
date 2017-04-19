package com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos;

/**
 * Este es un interface de demostración de cómo funcionan los interfaces
 * 
 * @author javierlete
 */
public interface Contrato {
	/**
	 * Este método no necesita ningún valor
	 */
	void clausula1();

	/**
	 * Este método trabaja con un argumento y devuelve un valor
	 * 
	 * @param s
	 *            texto que se introduce
	 * @return devuelve un entero
	 */
	int clausula2(String s);
}
