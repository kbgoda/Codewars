package kat7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class valley {

	public static void main(String[] args) {

		int[] nums = { 67, 93, 100, -16, 65, 97, 92};

		for (int i : nums) {
			System.out.print(i + " ");
		}

		nums = makeValley(nums);
		System.out.print("\n");

		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

	public static int[] makeValley(int[] arr) {
		Arrays.sort(arr);
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int[] newArr = new int[arr.length];

		if (isEven(arr.length) == true) {
			// Array is even shaped e.g. 8
			for (int i = arr.length - 1; i >= 0; i -= 1) {
				if (isEven(i)) {
					right.add(arr[i]);
				} else {
					left.add(arr[i]);
				}
			}

		} else {
			// For odd arrays
			for (int i = arr.length - 1; i > 0; i -= 1) {
				if (isEven(i)) {
					left.add(arr[i]);
				} else {
					right.add(arr[i]);
				}
			}
			right.add(arr[0]);
		}

		System.out.println();

		Collections.reverse(right);
		left.addAll(right);
		for (int i = 0; i < left.size(); i++) {
			System.out.println(left.get(i) + " ");
		}

		newArr = left.stream().mapToInt(i -> i).toArray();

		return newArr;
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

}
