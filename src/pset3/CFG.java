package pset3;

import java.util.*;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;

public class CFG {
    Set<Node> nodes = new HashSet<Node>();
    Map<Node, Set<Node>> edges = new HashMap<Node, Set<Node>>();
    
    public static class Node {
        int position;
        Method method;
        JavaClass clazz;
        
        Node(int p, Method m, JavaClass c) {
            position = p;
            method = m;
            clazz = c;
        }
        
        public Method getMethod() {
            return method;
        }
        
        public JavaClass getClazz() {
            return clazz;
        }
        
        public boolean equals(Object o) {
            if (!(o instanceof Node)) return false;
            Node n = (Node)o;
            return (position == n.position) && method.equals(n.method) && clazz.equals(n.clazz);
        }
        
        public int hashCode() {
            return position + method.hashCode() + clazz.hashCode();
        }
        
        public String toString() {
            return clazz.getClassName() + '.' + method.getName() + method.getSignature() + ": " + position;
        }
}
    
    public void addNode(int p, Method m, JavaClass c) {
        addNode(new Node(p, m, c));
    }
    
    private void addNode(Node n) {
        nodes.add(n);
        Set<Node> nbrs = edges.get(n);
        if (nbrs == null) {
            nbrs = new HashSet<Node>();
            edges.put(n, nbrs);
        }
    }
    public void addEdge(int p1, Method m1, JavaClass c1, int p2, Method m2, JavaClass c2) {
        Node n1 = new Node(p1, m1, c1);
        Node n2 = new Node(p2, m2, c2);
        addNode(n1);
        addNode(n2);
        Set<Node> nbrs = edges.get(n1);
        nbrs.add(n2);
        edges.put(n1, nbrs);
    }
    
    public void addEdge(int p1, int p2, Method m, JavaClass c) {
        addEdge(p1, m, c, p2, m, c);
    }
    
    public String toString() {
        return nodes.size() + " nodes\n" + "nodes: " + nodes + '\n' + "edges: " + edges;
    }
    
	public boolean isReachable(String methodFrom, String clazzFrom,
			String methodTo, String clazzTo) {
		// you will implement this method in Question 2.2
		Set<Node> sources = new HashSet<Node>();
		Node destination = null;
		for (Node node : nodes) {  					// find the nodes which are reachable from source
			if (node.getMethod().getName().equals(methodFrom)
					&& node.getClazz().getClassName().equals(clazzFrom)) {
				if (edges.get(node).isEmpty() == false) {
					sources.add(node); 
				}
			}
			if (node.getMethod().getName().equals(methodTo)
					&& node.getClazz().getClassName().equals(clazzTo)) {
				if (destination == null) {
					destination = new Node(0, node.getMethod(), node.getClazz());
				}
			}
		}
		if (sources.isEmpty() || destination == null) { 
			return false;
		}
		else {
			for (Node source : sources) {
				Set<Node> neighbors = edges.get(source);
				if (neighbors.contains(destination)) {
					return true;
				}
				else {
					for (Node neighbor : neighbors) {
						if ((neighbor.getMethod().equals(source.getMethod()) == false) && (neighbor.position == 0) ) {
							if (this.isReachable(neighbor.getMethod().getName(), neighbor.getClazz().getClassName(), methodTo,clazzTo)) {
								return true;
							}
						}
					}
				}
			}
			return false;
		}
	}
}