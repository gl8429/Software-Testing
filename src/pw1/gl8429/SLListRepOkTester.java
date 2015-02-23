package pw1;

import static org.junit.Assert.*;

import org.junit.Test;
import pw1.SLList.Node;

public class SLListRepOkTester {
    @Test public void t0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }
    @Test public void t1() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        l.header = n;
        n.elem = false;
        l.header.next = n;
        n.next = l.header;
        assertFalse(l.repOk());
    }
    // your code goes here
    @Test public void t2() {
        SLList l = new SLList();
        Node n = new Node();
        Node m = new Node();
        // your code goes here
        n.elem = true;
        m.elem = false;
        l.header = n;
        l.header.next = m;
        assertTrue(l.repOk());
    }
}
