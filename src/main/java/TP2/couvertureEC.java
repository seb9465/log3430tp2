package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class couvertureEC {
	
	Graph graphe;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test e1
	 * V1K1 -> e1 =	<{ v = -1, k = -1 }	, { erreur }>
	 */
	@Test
	protected void grapheRegularV1K1() {
		// Arrange
		int v = -1;
		int k = -1;
		
		// Assert
		assertThrows(IllegalArgumentException.class, () -> {
			// Act
			graphe = GraphGenerator.regular(v, k);
		});
	}
	
	/**
	 * Test e6
	 * V2K3 -> e6 =	<{ v = 4, k = 5 }	, { grapheOK }>
	 */
	@Test
	protected void grapheRegularV2K3() {
		// Arrange
		int v = 4;
		int k = 5;
		int maxEdges = v * k;
		
		// Act
		graphe = GraphGenerator.regular(v, k);
		
		// Assert
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected less then " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test e8
	 * V3K2 -> e8 =	<{ v = 5, k = 2 }	, { grapheOK }>
	 */
	@Test
	protected void grapheRegularV3K2() {
		// Arrange
		int v = 5;
		int k = 2;
		int maxEdges = v * k;
		
		// Act
		graphe = GraphGenerator.regular(v, k);
		
		// Assert
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected less then " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d10
	 * V11V22P5 -> d10 = 	<{ v1 = -4 , v2 = 0 , p = 1.5 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V2P5() {
		int v1 = -4;
		int v2 = 0;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d29
	 * V12V23P4 -> d29 = 	<{ v1 = 0 , v2 = 4 , p = 1.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P4() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 1.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d31
	 * V13V21P1 -> d31 = 	<{ v1 = 4 , v2 = -4 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V1P1() {
		// Arrange
		int v1 = 4;
		int v2 = -4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d42
	 * V13V23P2 -> d42 = 	<{ v1 = 4 , v2 = 4 , p = 0.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P2() {
		// Arrange
		int v1 = 4;
		int v2 = 4;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1 + v2, "Expected " + (v1 + v2) + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d43
	 * V13V23P3 -> d43 = 	<{ v1 = 4 , v2 = 4 , p = 0.5 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P3() {
		// Arrange
		int v1 = 4;
		int v2 = 4;
		double p = 0.5;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1 + v2, "Expected " + (v1 + v2) + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected less then" + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c4
	 * V11V21E4 -> c4 = 		<{ v1 = -4 , v2 = -4 , e = 20 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V1E4() {
		int v1 = -4;
		int v2 = -4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c17
	 * V12V22E1 -> c17 = 		<{ v1 = 0 , v2 = 0 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E1() {
		int v1 = 0;
		int v2 = 0;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c31
	 * V13V22E3 -> c31 = 		<{ v1 = 4 , v2 = 0 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E3() {
		int v1 = 4;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c34
	 * V13V23E2 -> c34 = 		<{ v1 = 4 , v2 = 4 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E2() {
		int v1 = 4;
		int v2 = 4;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2 + v1, "Expected " + v2 + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
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
	 * Test a4
	 * V1E4 -> a4 = 	<{ v = -4 , e = 20 } 	, { erreur }>
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
	 * Tests a7
	 * V2E3 -> a7 = 	<{ v = 0 , e = 0 } 		, { grapheOK }>
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
	 * Test a9
	 * V3E1 -> a9 = 	<{ v = 4 , e = -1 } 	, { erreur }>
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
	 * V3E2 -> a10 = 	<{ v = 4 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheSimpleIntIntV3E2() {
		int v = 4;
		int e = 0;
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}

}
