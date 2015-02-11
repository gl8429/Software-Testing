package pw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualsTester {
    /*
     * P1: For any non-null reference value x, x.equals(null) should return false.
     */
    @Test public void t0() {
        assertFalse(new Object().equals(null));
}
    // your test methods for P1 go here
    @Test public void t1() {
    	C x = new C(0);
    	assertFalse(x.equals(null));   	
}
    @Test public void t2() {
    	D x = new D(0, 1);
    	assertFalse(x.equals(null));   	
}
    /*
     * P2: It is reflexive: for any non-null reference value x, x.equals(x)
     * should return true.
     */
    // your test methods for P2 go here
    @Test public void t3() {
    	Object x = new Object();
    	assertTrue(x.equals(x));
}
    @Test public void t4() {
    	C x = new C(0);
    	assertTrue(x.equals(x));
}
    @Test public void t5() {
    	D x = new D(0, 1);
    	assertTrue(x.equals(x));
}
    /*
     * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
     * should return true if and only if y.equals(x) returns true.
     */
    // your test methods for P3 go here
    @Test public void t6() {
    	Object x = new Object();
    	Object y = new Object();
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t7() {
    	C x = new C(0);
    	C y = new C(0);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t8() {
    	D x = new D(0, 1);
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t9() {
    	Object x = new Object();
    	C y = new C(0);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t10() {
    	Object x = new Object();
    	C y = new C(0);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t11() {
    	Object x = new Object();
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t12() {
    	Object x = new Object();
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t13() {
    	C x = new C(0);
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    @Test public void t14() {
    	C x = new C(0);
    	D y = new D(0, 1);
    	if (x.equals(y)){
    		assertTrue(x.equals(y));
    	}else{
    		assertFalse(x.equals(y));
    	}
}
    
    /*
     * P4: It is transitive: for any non-null reference values x, y, and z,
     * if x.equals(y) returns true and y.equals(z) returns true, then
     * x.equals(z) should return true.
     */
    // you do not need to write tests for P4
}