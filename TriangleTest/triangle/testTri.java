package triangle;

import static org.junit.Assert.*; 
import org.junit.Ignore; 
import org.junit.Test; 

import triangle.triangle;


public class testTri{
	private triangle t ; 
	public void triangleTest(){ 
		t = new triangle(); 
	} 
		 
	@Test 
	public void sort1() { 
		int testVal = t.sort(1,1,3); 
		assertEquals(-1,testVal); 
	}
	
	@Test
	public void sort2(){
		int testVal = t.sort(1,2,3);
		assertEquals(-1,testVal);
	}
	
	@Test
	public void sort3(){
		int testVal = t.sort(3,3,4);
		assertEquals(1,testVal);
	}
	
	@Test
	public void sort4(){
		int testVal = t.sort(5,5,5);
		assertEquals(2,testVal);
	}
	
	@Test
	public void sort5(){
		int testVal = t.sort(3, 4, 5);
		assertEquals(3,testVal);
	}
	
	@Test
	public void sort6(){
		int testVal = t.sort(6,8,10);
		assertEquals(3,testVal);
	}
	
	@Test
	public void sort7(){
		int testVal = t.sort(7,8,9);
		assertEquals(4,testVal);
	}

}
