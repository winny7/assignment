import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class InsertAtStartTest extends SetupTests {

	@Test
	public void test() {
		
		//Test for empty linked list created in SetupTests
		ArrayList<Integer> answer1 = new ArrayList<Integer>();
		assertEquals(empty.getLinkedList(), answer1);
		
		//Test for single element linked list created in SetupTests
        ArrayList<Integer> answer2 = new ArrayList<Integer>( Arrays.asList(8) );
        assertEquals(single.getLinkedList(), answer2);
        
		//Test for multiple element linked list created in SetupTests
        ArrayList<Integer> answer3 = new ArrayList<Integer>( Arrays.asList(4,3,5,7,1,6) );
        assertEquals(multi.getLinkedList(), answer3);
	}

}
