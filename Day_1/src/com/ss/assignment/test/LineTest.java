/**
 * 
 */
package com.ss.assignment.test;

import com.ss.assignment.four.Line;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author nadik
 *
 */

@RunWith(Parameterized.class)
public class LineTest {
	
	private double x0, y0, x1, y1;
	private double expectedResult;
	
	
	public LineTest(double x0, double y0, double x1, double y1, double expectedResult) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
			{4.0, 1.0, 6.0, 5.0}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void testGetSlope() {
		Line line = new Line(x0, y0, x1, y1);
		assertEquals(expectedResult, line.getSlope(), .0001);
	}
}
