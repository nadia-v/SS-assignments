/**
 * 
 */
package com.ss.assignment.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import org.junit.Test;

import com.ss.assignment.weekendone.RecursionClass;
/**
 * @author nadik
 *
 */
public class RecursionClassTest {

	/**
	 * @param args
	 * 
	 * Test RecursionClass
	 */
	
	RecursionClass rc = new RecursionClass();
	
	@Test
	public void groupSumClumpTest() {
		
		assertTrue(rc.groupSumClump(Arrays.asList(2,4,8), 10));
		assertTrue(rc.groupSumClump(Arrays.asList(1,2,4,8,1), 14));
		assertTrue(rc.groupSumClump(Arrays.asList(), 0));
		assertTrue(rc.groupSumClump(Arrays.asList(8), 8));
		assertFalse(rc.groupSumClump(Arrays.asList(2,4,4,8), 14));
		assertFalse(rc.groupSumClump(Arrays.asList(), 9));
		assertFalse(rc.groupSumClump(Arrays.asList(8), 9));
		
	}

}
