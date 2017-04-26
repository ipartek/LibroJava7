package com.ipartek.formacion.mikelcuenca;

public class ApuntesMikel001 {

	@SuppressWarnings("unused")
	private static void tiposDeDatos() {

		// Ejemplo de tipos de datos
		
		
		
		
												
		int i; 					// variable sin inicializar						
		int a, b; 				// declaracion de dos variables sin inicializar				
		int z = 0; 				// declaracion de variable inicializada
		int g = 1, c = 2; 		// declaración de dos variables inicializadas

		i = 3; 					// inicializar variable después de declararla

		char car = 'A';

		System.out.println("test");

		int resto = 5 % 2; 		// operacion resto

		System.out.println("El resto de 5 / 2 es " + resto);

		int x = 3;
		// operador AND con cortocircuito. Evalúa la expresión de la izquierda y
		// si puede
		// resolver el condicional, no evalúa el de la derecha.
		System.out.println(1 <= x && x <= 10);

		x = -50;
		// operador OR con cortocircuito. Evalúa la expresión de la izquierda y
		// si se puede
		// resolver el condicional, no evalúa el de la derecha.
		System.out.println(1 >= x || x >= 10);

		// operador ? ternario. Si da true, da la respuesta a la izquierda de
		// los dos puntos.
		// Si da false, da la respuesta a la derecha de los dos puntos.
		
		int t = 1;
		int u = 2;
		boolean respuesta = t==u;
		
		respuesta = respuesta ?  true : false;
		
		
		System.out.println("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿");
		System.out.println("Respuesta a operador ? ternario = " + respuesta);
		
		boolean estaDentroDelRango = !(x <= 1 || x >= 10);

		System.out.println(estaDentroDelRango ? "SI" : "NO");

		int num1 = 3, num2 = 2;

		int max = num1 > num2 ? num1 : num2;

		System.out.println("El número mayor entre " + num1 + " y " + num2
				+ " es " + max);

		System.out.println(String.format("El máximo de %d y %d es %d", num1,
				num2, max));

	};

	public static void main(String[] args) {

		 tiposDeDatos();
		estructurasDeControl();

	}

	private static void estructurasDeControl() {

		System.out.println("Estructuras de Control");
		System.out.println("------------------------");

		// CONDICIONALES
		boolean condicion = false;
		boolean condicion2 = true;

		// ejemplo 1
		if (condicion)
			System.out.println("Hola"); // si no se ponen llaves el if solo
										// considera la primera
										// sentencia que aparece
		System.out.println("Linea suelta");

		// ejemplo 2
		if (condicion) {
			System.out.println("Hola"); // si se ponen llaves el if considera
										// todo el bloque
			System.out.println("Condicion1"); // de sentencias
		} else if (condicion2) {
			System.out.println("Condicion2");
		} else {
			System.out.println("ELSE");
		}

		// ejemplo 3
		if (condicion)
			System.out.println("Condicion1");
		else if (condicion2)
			System.out.println("Condicion2");
		else
			System.out.println("ELSE");

		
		int opcion = 2;

		switch (opcion) {
		case 1:
			System.out.println("UNO");	//se entra por el case y se sale por el break
			break;
		case 2:
			System.out.println("DOS");
			break;
		default:
			System.out.println("OTRO");
		}
		
		int mes = 4;
		int dias;
		
		switch(mes){
		case 2: dias = 28; break;
		case 4:
		case 6:
		case 9:
		case 11: dias = 30; break;
		default: dias = 31;
		}

		System.out.println(dias);
		
		
		
		
		//BUCLES
		
		//while y do while
		
		int c = 1;
		
		System.out.println("While 1");
		
		while(c <= 10)					//ejemplo con incremento posterior
			
			System.out.println(c++);	//y sin llaves solo para una sentencia
		
		
		
		int d = 1;
		
		System.out.println("While 2");
		
		while(d <= 10) {					//ejemplo con incremento anterior
		
			System.out.println(++d);		//y con llaves para una o varias sentencias
		}
		
		
		
		int e = 1;
		
		do {							//requiere que se realice la función al menos
			System.out.println(e++);	//una vez antes de comprobar la condición
		} while (e <= 10);
		
		
		
		
		//for
		
		for (int n = 1; n <= 10; n++)
			System.out.println("FOR: " + n);
		
		//equivalente a
		
		int m = 1;
		while (m <= 10) {
			System.out.println("FOR: " + m);
			m++;
		}
		
		
		//for (variable; expresión booleana; operación posterior)
		for (int up = 1, down = 10; up < down; up += 2, down /= 2)
			System.out.format("%d, %d\n", up, down);
		
		//digresion SECUENCIAS DE ESCAPE
			System.out.println("C:\nuevos\trabajos"); // \n = nueva línea; \t = tabulador
			System.out.println("C:\\nuevos\\trabajos"); //la contrabarra escapa la propia contrabarra
		
		//recorrido de arrays
		int[] arr = { 1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
			
	};

}

