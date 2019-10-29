package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {

	@Test
	public void testCamino1() {
		
		ClaseExamen clase = new ClaseExamen();
		
		float result = clase.metodoAProbar(5, 5);
		
		assertEquals(0, result, 0.0f);
	}

	@Test
	public void testCamino2() {
		
		ClaseExamen clase = new ClaseExamen();
		
		float result = clase.metodoAProbar(6, 5);
		
		assertEquals(0, result, 0.0f);
	}
}
