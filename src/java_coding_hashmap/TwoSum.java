package java_coding_hashmap;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	Map<Integer, Integer> map = new HashMap<>();

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];

			if (map.containsKey(compliment)) {
				return new int[] { map.get(compliment), i };
			}

			map.put(nums[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Given an array of integers nums and an integer target, return indices of the
		// two numbers such that they add up to target.
		// You may assume that each input would have exactly one solution, and you may
		// not use the same element twice.

		// Example 1:
		// Input: nums = [2,7,11,15], target = 9
		// Output: [0,1]
		// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		//
		// Example 2:
		// Input: nums = [3,2,4], target = 6
		// Output: [1,2]

		System.out.println("Enter the array values");
		int len = scan.nextInt();
		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = scan.nextInt();
		}

		System.out.println("Enter the target value");
		int target = scan.nextInt();

		TwoSum sum = new TwoSum();
		int[] result = sum.twoSum(nums, target);
		System.out.println(Arrays.toString(result));

	}

}
