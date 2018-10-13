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
	
	/**
	 * Test a1
	 */
	@Test
	protected void grapheSimpleIntIntV1E1() {
		int v = -4;
		int e = -1;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Test a4
	 */
	@Test
	protected void grapheSimpleIntIntV1E4() {
		int v = -4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Test a5
	 */
	@Test
	protected void grapheSimpleIntIntV2E1() {
		int v = 0;
		int e = -1;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Ce test est bon pour le cas V2E2 et le cas V2E3.
	 * Tests a6 et a7
	 */
	@Test
	protected void grapheSimpleIntIntV2E2() {
		int v = 0;
		int e = 0;
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test a8
	 */
	@Test
	protected void grapheSimpleIntIntV2E4() {
		int v = 0;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Test a9
	 */
	@Test
	protected void grapheSimpleIntIntV3E1() {
		int v = 4;
		int e = -1;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Test a10
	 */
	@Test
	protected void grapheSimpleIntIntV3E2() {
		int v = 4;
		int e = 0;
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test a11
	 */
	@Test
	protected void grapheSimpleIntIntV3E3() {
		int v = 4;
		int e = 4;
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test a12
	 */
	@Test
	protected void grapheSimpleIntIntV3E4() {
		int v = 4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Test b1
	 */
	@Test
	protected void grapheSimpleIntDoubleV1P1() {
		int v = -4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, p);
		});
	}
	
	/**
	 * Test b5
	 */
	@Test
	protected void grapheSimpleIntDoubleV1P5() {
		int v = -4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, p);
		});
	}
	
	/**
	 * Test b6
	 */
	@Test
	protected void grapheSimpleIntDoubleV2P1() {
		int v = 0;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, p);
		});
	}
	
	/**
	 * Test b7
	 */
	@Test
	protected void grapheSimpleIntDoubleV2P2() {
		int v = 0;
		double p = 0.0;
		graphe = GraphGenerator.simple(v, p);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test b8
	 */
	@Test
	protected void grapheSimpleIntDoubleV2P3() {
		int v = 0;
		double p = 0.5;
		graphe = GraphGenerator.simple(v, p);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test b9
	 */
	@Test
	protected void grapheSimpleIntDoubleV2P4() {
		int v = 0;
		double p = 1.0;
		graphe = GraphGenerator.simple(v, p);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test b10
	 */
	@Test
	protected void grapheSimpleIntDoubleV2P5() {
		int v = 0;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, p);
		});
	}
	
	/**
	 * Test b11
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P1() {
		int v = 10;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, p);
		});
	}
	
	/**
	 * Test b12
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P2() {
		int v = 10;
		double p = 0.0;
		graphe = GraphGenerator.simple(v, p);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test b13
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P3() {
		int v = 10;
		double p = 0.5;
		graphe = GraphGenerator.simple(v, p);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
	}
	
	/**
	 * Test b14
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P4() {
		int v = 10;
		double p = 1.0;
		graphe = GraphGenerator.simple(v, p);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
	}
	
	/**
	 * Test b15
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P5() {
		int v = 10;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, p);
		});
	}
}
