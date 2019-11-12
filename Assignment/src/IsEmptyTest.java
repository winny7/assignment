import static org.junit.Assert.*;

import org.junit.Test;


public class IsEmptyTest extends SetupTests {

	@Test
	public void test() {
		
		//Test for empty linked list
		assertEquals(empty.isEmpty(), true);
		
		//Test for single element linked list
		assertEquals(single.isEmpty(), false);
		
		//Test for multiple element linked list
		assertEquals(multi.isEmpty(), false);
	}

}
