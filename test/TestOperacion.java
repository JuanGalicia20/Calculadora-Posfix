import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadoraposfix.CalculadoraCod;


/**
*
* @author Juan Andres Galicia Reyes 20298 UVG 2021
* @version 06/02/21
*/
class TestOperacion {

	@Test
	void test() {
		CalculadoraCod p = new CalculadoraCod();
		String r2 = p.decode("C:/Users/juana/Documents/UVG/2 año/Algos y Datos/HT2/Ejemplo1.txt");
		assertEquals("15",r2);
	}

}
