/**
 * 
 */
package com.ss.assignment.weekendone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nadik
 *
 */
public class RecursionClass {

	/**
	 * @param args
	 * 
	 * Check if a combination of integers from a given array can be summed to a target
	 * Adjacent elements with the same values can be only used all together or not at all
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			List <Integer> nums = new ArrayList<>();
			for(int i=0;i<args.length-1;i++) {
				nums.add(Integer.parseInt(args[i]));
			}
			int target = Integer.parseInt(args[args.length-1]);
			System.out.println("Numbers: "+nums+", Target: "+target);
			
			RecursionClass rc = new RecursionClass();
			System.out.println(rc.groupSumClump(nums, target));
			rc.groupSumClump(nums, target);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean groupSumClump(List<Integer> nums, int target){
		// Create a new array where adjacent elements with the same values
		// are presented as their sum
		// Call recursive helper method
	    if (nums.size() == 0) {
	        return target == 0;
	    }
	    else if (nums.size() == 1) {
	    	return target == nums.get(0);
	    }   
		List <Integer> numbers = new ArrayList<>();
		int curr = nums.get(0);
		int temp = nums.get(0);
		numbers.add(curr);
		
		for(int i=1;i<nums.size();i++) {
			if(nums.get(i) != curr && temp == curr) {
				if(i == nums.size()-1) {
					numbers.add(nums.get(i));
				}
				else if (nums.get(i) != nums.get(i+1)) {
					numbers.add(nums.get(i));
				}
				curr = nums.get(i);
				temp = nums.get(i);
			}
			else if(nums.get(i) != curr && temp != curr) {
				numbers.add(temp);
				if(i == nums.size()-1) {
					numbers.add(nums.get(i));
				}
				curr = nums.get(i);
				temp = nums.get(i);
			}
			else if(nums.get(i) == curr) {
				temp = temp + curr;
			}
		}
		System.out.println("NUMBERS: "+numbers);
		return helper(numbers, target, 0);
	}
	
	
	// Recursive helper method
	public boolean helper(List<Integer> numbers, int target, int start) {
	    
	    if (start == numbers.size() - 1) {
	        return target == numbers.get(numbers.size() - 1);
	    }   
	    else if(target == 0) {
	    	return true;
	    }
	    else if (helper(numbers, target - numbers.get(start), start + 1)) {
	        return helper(numbers, target - numbers.get(start), start + 1);
	    }
	    return helper(numbers, target, start + 1);
	}
}
