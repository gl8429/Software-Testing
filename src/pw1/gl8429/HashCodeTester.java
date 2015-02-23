package pw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashCodeTester {
    /*
     * P5: If two objects are equal according to the equals(Object)
     * method, then calling the hashCode method on each of
     * the two objects must produce the same integer result.
     */
     // your test methods go here
	@Test public void t0() {
    	Object x = new Object();
    	Object y = new Object();
    	if (x.equals(y)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t1() {
    	C x = new C(0);
    	C y = new C(0);
    	if (x.equals(y)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t2() {
    	D x = new D(0, 1);
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t3() {
    	Object x = new Object();
    	C y = new C(0);
    	if (x.equals(y)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t4() {
    	Object x = new Object();
    	C y = new C(0);
    	if (y.equals(x)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t5() {
    	Object x = new Object();
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t6() {
    	Object x = new Object();
    	D y = new D(0, 1);
    	if (y.equals(x)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t7() {
    	C x = new C(0);
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
    @Test public void t8() {
    	C x = new C(0);
    	D y = new D(0, 1);
    	if (y.equals(x)){
    		assertTrue(x.hashCode() == y.hashCode());
    	}
}
}
