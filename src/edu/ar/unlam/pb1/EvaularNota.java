package edu.ar.unlam.pb1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.ar.unlam.pb1.practicos.PracticoUno;

class EvaularNota {

	@Test
	void test() {
		PracticoUno pu = new PracticoUno();
		boolean res = pu.EvaluarNota(7,7);
		assertTrue(res);
		res = pu.EvaluarNota(7, 6);
		assertFalse(res);
				
	}

}
