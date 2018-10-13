package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.lang.Exception;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class TP2 {

	Graph graphe;
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	protected void grapheSimpleIntIntV1E1() {
		int v = -4;
		int e = -1;
		assertThrows(Exception.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	@Test
	protected void grapheSimpleIntIntV1E2() {
		int v = -4;
		int e = 0;
		assertThrows(Exception.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	@Test
	protected void grapheSimpleIntIntV1E3() {
		int v = -4;
		int e = 4;
		assertThrows(Exception.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	@Test
	protected void grapheSimpleIntIntV2E1() {
		int v = 0;
		int e = -1;
		assertThrows(Exception.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Ce test est bon pour le cas V2E2 et le cas V2E3.
	 */
	@Test
	protected void grapheSimpleIntIntV2E2() {
		int v = 0;
		int e = 0;
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	
	
}