package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void AddTest() {
		AddingMachine am = new AddingMachine();
		am.add(5);
		assertTrue(am.getTotal() == 5);
	}
	
	@Test
	void SubtractTest() {
		AddingMachine am = new AddingMachine();
		am.subtract(5);
		assertTrue(am.getTotal() == -5);
	}
	
	@Test
	void ToStringTest() {
		AddingMachine am = new AddingMachine();
		am.add(5);
		am.subtract(3);
		assertTrue(am.toString().equals("0 + 5 - 3"));
	}
	
	@Test
	void ClearTest() {
		AddingMachine am = new AddingMachine();
		am.add(5);
		assertTrue(am.getTotal() == 5);
		am.clear();
		assertTrue(am.getTotal() == 0);
	}

}
