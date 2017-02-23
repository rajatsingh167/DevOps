package com.fcat.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class FcatTest {

	Math m ;
	@Before
	public void setUp() throws Exception {
		m = new Math();
	}

	@Test
	public void WhenTheNumberIsZeroSystemShouldReturnOne(){
		
		assertEquals(1, m.getFact(0));
	}

	@Test( expected=java.lang.IllegalArgumentException.class)
	public void WhenTheNumberIsNegativeSystemShouldThrowException()
	{
		m.getFact(-4);
	}

	
	
	@Test
	public void whenTheNumberIsPositiveSystemShouldReturnExpectedOutput()
	{
		assertEquals(24 , m.getFact(4));
	}
	
	@Test(timeout=1)
	public void testWithTimeout() {
	  m.testTimeExecution();
	}
	
	
	@Test
    public void evenNumberTest(){
  
        assertFalse(m.isEvenNumber(4));
	}
	
}
