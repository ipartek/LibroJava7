
public class CantabriaSantander {

	public static void main(String[] args) {
		
		System.out.format("LISTA DE PLAYAS DE SANTANDER (CANTABRIA) : \n");
		
		
		String playasSantander [] = {
				"ORIÑON",
				"PLAYA DE DICIDO - MIOÑO",
				"BERRIA",
				"PLAYA DE EL RIS (NOJA)",
				"LAREDO (PINOS)",
				"SONABIA",
				"PLAYA DE BRAZOMAR (COTOLINO)",
				"PLAYA DE ARENILLAS",
				"PLAYA DE SAN JULIÁN - LIENDO",
				"PLAYA DE LAREDO",
				"LA FORTALEZA",
				"EL BRUSCO",
				"PLAYA DEL ARENAL",
				"PLAYA DE CUBERRIS",
				"PLAYA DE ANTUERTA ",
				"PLAYA DE GALIZANO",
				"PLAYA DE LANGRE",
				"LOREDO",
				"ISLA DE SANTA MARINA - IZQUIERDA",
				"ISLA DE SANTA MARINA - DERECHA",
				"PLAYA DE SOMO",
				"PLAYA EL CAMELLO",
				"PLAYA EL SARDNERO",
				"LIENCRES (PLAYA DE VALDEARENAS)",
				"PLAYA DE USGO",
				"PLAYA DE LOS CABALLOS",
				"PLAYA DE LOS LOCOS",
				"PLAYA DE LA TABLÍA",
				"LIENCRES (PLAYA CANALLAVE)",
				"LA VACA (ORIÑON - LA BALLENA)",
				"PORTIO",
				"LA VACA"				
				
		}; //CIERRE playasSantander
				
		
				
		for(int i=0; i < playasSantander.length; i++){
			System.out.println(playasSantander[i]);
			}	//CIERRE for
		
		//número de playas
				System.out.format("NÚMERO DE PLAYAS: %d", playasSantander.length);
	} //CIERRE main

} //CIERRE class
