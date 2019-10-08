package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest { // This class has the purpose of testing out the AddingMachine class.

	@Test
	void testAddition() {	// testAddition is used to check and see if the add method works properly, so input .add(1) should return 1
							// this method simultaneously tests the getTotal method
		
		AddingMachine tester = new AddingMachine(); 
		tester.add(1);
		assertEquals(1,tester.getTotal());
	}
	
	@Test
	void testToString() {	// testToString is used to check and see if the toString method works properly, so input of
							// add(1) , subtract(1) add(3) should return "0 + 1 - 1 + 3"
		
		AddingMachine tester = new AddingMachine(); 
		tester.add(1);
		tester.subtract(1);
		tester.add(3);
		assertEquals("0 + 1 - 1 + 3",tester.toString());
	}
	
	@Test
	void testSubtraction() {	// testSubtraction is used to check and see if the subtract method works properly, so input .subtract(5) 
								// should return -5. This method simultaneously tests the getTotal method
		
		AddingMachine tester = new AddingMachine(); 
		tester.subtract(5);
		assertEquals(-5, tester.getTotal());
	}
	
	@Test
	void testClearHistory() {	// testClearHistory is used to see if the part of the clear() method will clear the string containing
								// the history of operations.
		
		AddingMachine tester = new AddingMachine(); 
		tester.add(1);
		tester.add(1);
		tester.clear();
		assertEquals("0", tester.toString());
	}
	
	@Test
	void testClearValues() {	// testClearValues is used to see if the part of the clear() method will clear the integer value 
								// of the current total, returning it to 0
		
		AddingMachine tester = new AddingMachine(); 
		tester.add(1);
		tester.add(1);
		tester.clear();
		assertEquals(0, tester.getTotal());
	}

}
