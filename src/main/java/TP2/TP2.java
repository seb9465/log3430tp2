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
	void grapheSimpleIntIntV1E1() {
		int v = -1;
		int e = -1;
		assertThrows(Exception.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	@Test
	private void grapheSimpleIntIntV1E2() {
		int v = -1;
		int e = 0;
		assertThrows(Exception.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
}
