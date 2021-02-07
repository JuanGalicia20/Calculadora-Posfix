/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;

import calculadoraposfix.CalculadoraCod;


import static org.junit.jupiter.api.Assertions.*;

/**
*
* @author Juan Andres Galicia Reyes 20298 UVG 2021
* @version 06/02/21
*/
class TestOperaciones {
    
	@Test
	void test1() {
		CalculadoraCod p = new CalculadoraCod();
		int r1 = p.division(1, 6);
		assertEquals(6,r1);
	}
	
	@Test
	void test2() {
		CalculadoraCod p = new CalculadoraCod();
		int r2 = p.multiplicacion(1, 2);
		assertEquals(2,r2);
	}
	
	@Test
	void test5() {
		CalculadoraCod p = new CalculadoraCod();
		int r1 = p.division(2, 4);
		assertEquals(2,r1);
	}
	
	@Test
	void test3() {
		CalculadoraCod p = new CalculadoraCod();
		int r1 = p.suma(5, 2);
		assertEquals(7,r1);
	}
	
	@Test
	void test4() {
		CalculadoraCod p = new CalculadoraCod();
		int r1 = p.resta(2, 5);
		assertEquals(3,r1);
	}
	
	@Test
	void test6() {
		CalculadoraCod p = new CalculadoraCod();
		int r1 = p.resta(4, 1);
		assertEquals(-3,r1);
	}
	
}
