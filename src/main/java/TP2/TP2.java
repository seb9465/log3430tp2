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
	 */
	@Test
	protected void grapheSimpleIntDoubleV3P5() {
		int v = 10;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, p);
		});
	}
	
	/**
	 * Test c1
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V1E1() {
		int v1 = -4;
		int v2 = -4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c4
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
	 * Test c5
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V2E1() {
		int v1 = -4;
		int v2 = 0;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c8
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V2E4() {
		int v1 = -4;
		int v2 = 0;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c9
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V3E1() {
		int v1 = -4;
		int v2 = 4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c12
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V3E4() {
		int v1 = -4;
		int v2 = 4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c13
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V1E1() {
		int v1 = 0;
		int v2 = -4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c16
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V1E4() {
		int v1 = 0;
		int v2 = -4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c17
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
	 * Test c18
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E2() {
		int v1 = 0;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c19
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E3() {
		int v1 = 0;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c20
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E4() {
		int v1 = 0;
		int v2 = 0;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c21
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E1() {
		int v1 = 0;
		int v2 = 4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c22
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E2() {
		int v1 = 0;
		int v2 = 4;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c23
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E3() {
		int v1 = 0;
		int v2 = 4;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c24
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E4() {
		int v1 = 0;
		int v2 = 4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c25
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V1E1() {
		int v1 = 4;
		int v2 = -4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c28
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V1E4() {
		int v1 = 4;
		int v2 = -4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c29
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E1() {
		int v1 = 4;
		int v2 = 0;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c30
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E2() {
		int v1 = 4;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c31
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
	 * Test c32
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E4() {
		int v1 = 4;
		int v2 = 0;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c33
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E1() {
		int v1 = 4;
		int v2 = 4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c34
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
	 * Test c35
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E3() {
		int v1 = 4;
		int v2 = 4;
		int e = 12;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2 + v1, "Expected " + v2 + v1 + " vertices, got " + graphe.V() + " vertices.");
	}
	
	/**
	 * Test c36
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E4() {
		int v1 = 4;
		int v2 = 4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}

	/**
	 * Test d1
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V1P1() {
		int v1 = -4;
		int v2 = -4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d5
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V1P5() {
		int v1 = -4;
		int v2 = -4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d6
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V2P1() {
		int v1 = -4;
		int v2 = 0;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d10
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
	 * Test d11
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V3P1() {
		int v1 = -4;
		int v2 = 4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d15
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V3P5() {
		int v1 = -4;
		int v2 = 4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d16
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V1P1() {
		int v1 = 0;
		int v2 = -4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d20
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V1P5() {
		int v1 = 0;
		int v2 = -4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d21
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P1() {
		int v1 = 0;
		int v2 = 0;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d22
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P2() {
		// Arrange
		int v1 = 0;
		int v2 = 0;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d23
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P3() {
		// Arrange
		int v1 = 0;
		int v2 = 0;
		double p = 0.5;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
				
		// Assert
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d24
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P4() {
		// Arrange
		int v1 = 0;
		int v2 = 0;
		double p = 1.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
				
		// Assert
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d25
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P5() {
		int v1 = 0;
		int v2 = 0;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d26
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P1() {
		int v1 = 0;
		int v2 = 4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d27
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P2() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d28
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P3() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 0.5;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d29
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
	 * Test d30
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P5() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d31
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
	 * Test d35
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V1P5() {
		int v1 = 4;
		int v2 = -4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d36
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P1() {
		int v1 = 4;
		int v2 = 0;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d37
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P2() {
		// Arrange
		int v1 = 4;
		int v2 = 0;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d38
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P3() {
		// Arrange
		int v1 = 4;
		int v2 = 0;
		double p = 0.5;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d39
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P4() {
		// Arrange
		int v1 = 4;
		int v2 = 0;
		double p = 1.0;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), maxEdges, "Expected " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d40
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P5() {
		int v1 = 4;
		int v2 = 0;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d41
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P1() {
		int v1 = 4;
		int v2 = 4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d42
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
	 * Test d44
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P4() {
		// Arrange
		int v1 = 4;
		int v2 = 4;
		double p = 1.0;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1 + v2, "Expected " + (v1 + v2) + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), maxEdges, "Expected " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d45
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P5() {
		int v1 = 4;
		int v2 = 4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test e1
	 */
	@Test
	protected void grapheRegularV1K1() {
		int v = -1;
		int k = -1;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.regular(v, k);
		});
	}
	
	/**
	 * Test e4
	 */
	@Test
	protected void grapheRegularV2K1() {
		int v = 4;
		int k = -1;
		assertThrows(Exception.class, () -> {
			graphe = GraphGenerator.regular(v, k);
		});
	}
	
	/**
	 * Test e5
	 */
	@Test
	protected void grapheRegularV2K2() {
		// Arrange
		int v = 4;
		int k = 2;
		int maxEdges = v * k;
		
		// Act
		graphe = GraphGenerator.regular(v, k);
		
		// Assert
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected less then " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test e6
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
	 * Test e7
	 */
	@Test
	protected void grapheRegularV3K1() {
		int v = 5;
		int k = -1;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.regular(v, k);
		});
	}
	
	/**
	 * Test e8
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
}
