package edu.teamrocket;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.teamrocket.tarifa.*;
import edu.teamrocket.carrera.Carrera;

class TarifaTest {

	Carrera carrera = new Carrera("4929637175949220");

	@Test
	void getCosteDistanciaTest() {
		double distancia = 7.75;
		double esperado = 10.4625;
		double delta = 0.01;

		assertEquals(esperado, Tarifa.getCosteDistancia(distancia), delta);
	}

	@Test
	void getCosteTiempo() {
		int minutos = 10;
		double costeTiempoEsperado = 3.5;
		double delta = 0.01;
		assertEquals(costeTiempoEsperado, Tarifa.getCosteTiempo(minutos), delta);
	}

	@Test
	void getCosteTotalEsperado() {
		carrera.setDistancia(7.75);
		carrera.setTiempoEsperado(10);
		double costeTotal = 7.75 * 1.35 + 0.35 * 10;
		double delta = 0.01;
		assertEquals(costeTotal, Tarifa.getCosteTotalEsperado(carrera), delta);
	}

	@Test
	void getCosteTotalEsperadoMinimoTest() {
		carrera.setDistancia(2);
		carrera.setTiempoEsperado(2);
		double delta = 0.01;
		assertEquals(5, Tarifa.getCosteTotalEsperado(carrera), delta);
	}

}
