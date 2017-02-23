import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactTest {

	Maths m;
	@Before
	public void setUp() throws Exception {
		m=new Maths();
	}
	
	
	/*
	 * 1.when the number is zero system should return one.
	 * 2.when the number is one system should return one.
	 * 3.when the number is negative system should throw exception.
	 * 4.when the number is positive system should return expected output.
	 */
	
	@Test
	public void whenTheNumberIsZeroSystemShouldReturnOne()
	{
		assertEquals(1, m.getFact(0));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenTheNumberIsNegativeSystemShouldThorwException()
	{
		m.getFact(-4);
	}
	
	@Test
	private void whenTheNumberIsPositiveSystemShouldReturnExpectedOutput()
	{
		assertEquals(24, m.getFact(4));
	}

	

}
