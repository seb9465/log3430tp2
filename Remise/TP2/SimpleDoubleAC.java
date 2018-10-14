package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class SimpleDoubleAC {
	Graph graphe;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test b1
	 * V1P1 -> b1 =		<{ v = -4 , p = -1.0 } 	, { erreur }>
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
	 * V1P5 -> b5 =		<{ v = -4 , p = 1.5 } 	, { erreur }>
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
	 * V2P1 -> b6 =		<{ v = 0 , p = -1.0 } 	, { erreur }>
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
	 * V2P2 -> b7 =		<{ v = 0 , p = 0.0 } 	, { grapheOK }>
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
	 * V2P3 -> b8 =		<{ v = 0 , p = 0.5 } 	, { grapheOK }>
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
	 * V2P4 -> b9 =		<{ v = 0 , p = 1.0 } 	, { grapheOK }>
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
	 * V2P5 -> b10 =		<{ v = 0 , p = 1.5 } 	, { erreur }>
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
	 * V3P1 -> b11 =		<{ v = 10 , p = -1.0 } 	, { erreur }>
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
	 * V3P2 -> b12 =		<{ v = 10 , p = 0.0 } 	, { grapheOK }>
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
	 * V3P3 -> b13 =		<{ v = 10 , p = 0.5 } 	, { grapheOK }>
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P3() {
		// Arrange
		int v = 10;
		double p = 0.5;
		int maxEdges = v * (v - 1) / 2;
		
		// Act
		graphe = GraphGenerator.simple(v, p);
		
		// Assert
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected " + graphe.E() + " edges to be inferior to the maximum amount of edges possible wich is " + maxEdges + " edges");
	}
	
	/**
	 * Test b14
	 * V3P4 -> b14 =		<{ v = 10 , p = 1.0 } 	, { grapheOK }>
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P4() {
		// Arrange
		int v = 10;
		double p = 1.0;
		int maxEdges = v * (v - 1) / 2;
		
		// Act
		graphe = GraphGenerator.simple(v, p);
		
		// Assert
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), maxEdges, "Expected " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test b15
	 * V3P5 -> b15 =		<{ v = 10 , p = 1.5 } 	, { erreur }>
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
