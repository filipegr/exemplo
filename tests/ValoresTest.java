import junit.framework.TestCase;

public class ValoresTest extends TestCase {

	Valores valores;
	
	public void testIns_10(){
		valores = new Valores();
		assertTrue(valores.ins(10));
	}
	
	public void testIns_0(){
		valores = new Valores();
		assertFalse(valores.ins(0));
	}
	
	public void testIns_lower0(){
		valores = new Valores();
		assertFalse(valores.ins(-1));
	}
	
	public void testIns_full(){
		valores = new Valores();
		valores.ins(10);
		valores.ins(20);
		valores.ins(30);
		valores.ins(40);
		valores.ins(50);
		valores.ins(60);
		valores.ins(70);
		valores.ins(80);
		valores.ins(90);
		valores.ins(100);
		assertFalse(valores.ins(110));
	}
	
	public void testDel(){
		valores = new Valores();
		valores.ins(10);
		valores.ins(20);
		assertEquals(valores.del(20),1);
		assertEquals(valores.del(10),0);
	}
	
	public void testDelEmpty(){
		valores = new Valores();
		assertEquals(valores.del(20),-1);
	}
	
	public void testSize(){
		valores = new Valores();
		valores.ins(10);
		valores.ins(20);
		assertEquals(valores.size(),2);
		valores.ins(30);
		assertEquals(valores.size(),3);
	}
	
	public void testMean(){
		valores = new Valores();
		 valores.ins(10);
		 valores.ins(20);
		 assertEquals(valores.mean(),15.0);
	}
	
	public void testMean_empty(){
		valores = new Valores();
		 assertEquals(valores.mean(),-1.0);
	}
	
	public void testGreater(){
		valores = new Valores();
		valores.ins(10);
		valores.ins(20);
		assertEquals(valores.greater(),20);
	}
	
	public void testGreater_empty(){
		valores = new Valores();
		assertEquals(valores.greater(),-1);
	}
	
	public void testLower(){
		valores = new Valores();
		valores.ins(10);
		valores.ins(20);
		assertEquals(valores.lower(),10);
	}
	
	public void testLower_empty(){
		valores = new Valores();
		assertEquals(valores.lower(),-1);
	}
}
