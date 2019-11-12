//import static org.junit.Assert.*;

//import java.util.ArrayList;
//import java.util.Arrays;

import org.junit.Before;
//import org.junit.Test;


public class SetupTests {

	 /**
     * Lists for the three different configurations to test.
     */
    SinglyLinkedList empty;   // empty list
    SinglyLinkedList single;  // one-element list
    SinglyLinkedList multi;   // multiple-element list
    
    @Before
    public void setUp() {
		empty = new SinglyLinkedList();         // []

        single = new SinglyLinkedList();        // [8]
        single.insertAtStart(8);

        multi = new SinglyLinkedList();         // [4 3 5 7 1 6]
        multi.insertAtStart(6);
        multi.insertAtStart(1);
        multi.insertAtStart(7);
        multi.insertAtStart(5);
        multi.insertAtStart(3);
        multi.insertAtStart(4);
        
    }
   

}
