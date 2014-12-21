package net.singlex.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciTest {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {

		{ 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
	}

	private int fInput;
	private int fExpected;

	/*
	 * Each instance of FibonacciTest will be constructed using the two-argument
	 * constructor and the data values in the @Parameters method.
	 */
	public FibonacciTest(int input, int expected) {
		fInput = input;
		fExpected = expected;
	}

	@Test
	public void test() {
		assertEquals(fExpected, Fibonacci.compute(fInput));
	}
}