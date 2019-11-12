import static org.junit.Assert.*;

import org.junit.Test;


public class LengthOfLinkedListTest extends SetupTests {

	@Test
	public void test() {
		
		//Test for empty linked list
		assertEquals(empty.lengthOfLinkedList(), 0);

		//Test for single element linked list
		assertEquals(single.lengthOfLinkedList(), 1);

		//Test for multiple element linked list
		assertEquals(multi.lengthOfLinkedList(), 6);
	}

}
