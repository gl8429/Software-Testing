package pset5;

import static org.junit.Assert.*;
import java.util.TreeSet;
import java.util.Set;
import org.junit.Test;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GraphTester {
    // tests for method "addEdge" in class "Graph"
    @Test public void tae0() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1]}");
    }
    // your tests for method "addEdge" in class "Graph" go here
    // you must provide at least 4 test methods;
    // each test method must have at least 1 invocation of addEdge;
    // each test method must have at least 1 test assertion;
    // your test methods must provide full statement coverage of your
    //   implementation of addEdge and any helper methods
    // no test method directly invokes any method that is not
    //   declared in the Graph class as given in this homework
    // tests for method "reachable" in class "Graph"
    
    @Test public void tae1(){
    	Graph graph = new Graph();
    	graph.addEdge(0, 1);
    	graph.addEdge(0, 2);
    	assertEquals("nodes: [0, 1, 2]\nedges: {0=[1, 2]}", graph.toString());
    }
    
    @Test public void tae2(){
    	Graph graph = new Graph();
    	graph.addEdge(0, 1);
    	graph.addEdge(0, 2);
    	graph.addEdge(1, 0);
    	graph.addEdge(2, 0);
    	assertEquals("nodes: [0, 1, 2]\nedges: {0=[1, 2], 1=[0], 2=[0]}", graph.toString());    	
    }
    
    @Test public void tae3(){
    	Graph graph = new Graph();
    	graph.addEdge(0, 2);
    	graph.addEdge(2, 0);
    	assertEquals("nodes: [0, 2]\nedges: {0=[2], 2=[0]}", graph.toString());
    }
    
    @Test public void tae4(){
    	Graph graph = new Graph();
    	graph.addEdge(0, 2);
    	graph.addEdge(0, 2);
    	assertEquals("nodes: [0, 2]\nedges: {0=[2]}", graph.toString());
    }
    // your tests for method "reachable" in class "Graph" go here
    // you must provide at least 6 test methods;
    // each test method must have at least 1 invocation of reachable;
    // each test method must have at least 1 test assertion;
    // at least 2 test methods must have at least 1 invocation of addEdge;
    // your test methods must provide full statement coverage of your
    //  implementation of reachable and any helper methods
    //no test method directly invokes any method that is not
    //  declared in the Graph class as given in this homework
    @Test public void tr0() {
        Graph g = new Graph();
        g.addNode(1);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(1);
        assertTrue(g.reachable(nodes, nodes));
    }
	
	@Test public void tr1() {
		Graph g = new Graph();
		g.addNode(1);
		Set<Integer> nodes = new TreeSet<Integer>();
		nodes.add(2);
		assertFalse(g.reachable(nodes, nodes));
	}
	
	@Test public void tr2() {
		Graph g = new Graph();
		g.addNode(0);
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		Set<Integer> nodes1 = new TreeSet<Integer>();
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes1.add(0);
		nodes2.add(3);
		assertTrue(g.reachable(nodes1, nodes2));
	}
	
	@Test public void tr3() {
		Graph g = new Graph();
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		g.addNode(4);
		g.addNode(5);
		g.addEdge(1,2);
		g.addEdge(2,1);
		g.addEdge(2,3);
		g.addEdge(3,2);
		g.addEdge(3,1);
		g.addEdge(3,4);
		g.addEdge(4,5);
		Set<Integer> node1 = new TreeSet<Integer>();
		Set<Integer> node2 = new TreeSet<Integer>();
		node1.add(2);
		node1.add(3);
		node2.add(1);
		assertTrue(g.reachable(node1, node2));
	}
	
	
	@Test public void tr4() {
		Graph g = new Graph();
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		g.addEdge(1,2);
		g.addEdge(2,1);
		g.addEdge(2,3);
		Set<Integer> nodes1 = new TreeSet<Integer>();
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes1.add(1);
		nodes2.add(3);
		assertFalse(g.reachable(nodes1, nodes2));
	}
	
	
	@Test public void tr5() {
		Graph g = new Graph();
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		g.addNode(4);
		
		g.addEdge(1,2);
		g.addEdge(2,1);
		
		g.addEdge(3,4);
		g.addEdge(4,3);
		
		Set<Integer> nodes1 = new TreeSet<Integer>();
		Set<Integer> nodes2 = new TreeSet<Integer>();
		nodes1.add(1);
		nodes1.add(2);
		nodes2.add(3);
		nodes2.add(4);
		assertFalse(g.reachable(nodes1, nodes2));
	}
	
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	
	@Test
	public void tr6() {
		exception.expect(IllegalArgumentException.class);
		Graph g = new Graph();
		g.addNode(0);
		Set<Integer> nodes = new TreeSet<Integer>();
		nodes.add(1);
		assertFalse(g.reachable(null, nodes));

	}
	
	public void tr7() {
		exception.expect(IllegalArgumentException.class);
		Graph g = new Graph();
		g.addNode(0);
		Set<Integer> nodes = new TreeSet<Integer>();
		nodes.add(1);
		assertFalse(g.reachable(nodes, null));

	}
	
	public void tr8() {
		exception.expect(IllegalArgumentException.class);
		Graph g = new Graph();
		g.addNode(0);
		Set<Integer> nodes = new TreeSet<Integer>();
		nodes.add(1);
		assertFalse(g.reachable(null, null));

	}
    
}