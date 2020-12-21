/**
 * 
 */
package com.ss.assignment.weekendone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nadik
 *
 */
public class RecursionClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> nums = new ArrayList<>();
		for(int i=0;i<args.length-1;i++) {
			nums.add(Integer.parseInt(args[i]));
		}
		int target = Integer.parseInt(args[args.length-1]);
	
		
		RecursionClass rc = new RecursionClass();
		System.out.println(rc.groupSumClump(nums, target));
		rc.groupSumClump(nums, target);

	}
	public boolean groupSumClump(List<Integer> nums, int target){
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
				if (i == nums.size()-1 || nums.get(i) != nums.get(i+1)) {
					numbers.add(nums.get(i));
				}
				curr = nums.get(i);
				temp = nums.get(i);
			}
			else if(nums.get(i) != curr && temp != curr) {
				numbers.add(temp);
				curr = nums.get(i);
				temp = nums.get(i);
			}
			else if(nums.get(i) == curr) {
				temp = temp + curr;
			}
		}
		return helper(numbers, target, 0);
	}
	
	
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
