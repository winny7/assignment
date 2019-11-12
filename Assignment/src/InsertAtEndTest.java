import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class InsertAtEndTest extends SetupTests {

	@Test
	public void test() {
		
		//Test for empty linked list
		empty.insertAtEnd(1);
		ArrayList<Integer> answer1 = new ArrayList<Integer>( Arrays.asList(1));
		assertEquals(empty.getLinkedList(), answer1);
		
		//Test for single element linked list
		single.insertAtEnd(1);
		ArrayList<Integer> answer2 = new ArrayList<Integer>( Arrays.asList(8, 1));
		assertEquals(single.getLinkedList(), answer2);
		
		//Test for multiplt element linked list
		multi.insertAtEnd(1);
		ArrayList<Integer> answer3 = new ArrayList<Integer>( Arrays.asList(4,3,5,7,1,6,1));
		assertEquals(multi.getLinkedList(), answer3);
	}

}
