package kat6;

import java.util.ArrayList;

public class LongestConsec {

	public static void main(String[] args) {
		String[] words = { "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail" };
		System.out.println(longestConsec(words, 2));
	}

	public static String longestConsec(String[] strarr, int k) {
		int n = strarr.length;
		// Base cases
		if(k <= 0 || k > strarr.length || n == 0) return "";
		// Length of strings array
		ArrayList<String> strings = getAllConsecutiveStrings(strarr, k);
		// Get the first string with the longest length
		return getLongestString(strings);
	}
	
	public static ArrayList<String> getAllConsecutiveStrings(String[] strings, int numStr) {
		int numOfConsecString = strings.length - numStr;
		ArrayList<String>results = new ArrayList<String>();
		// For example 8 strings with 4 as numStr will
		// Result in 5 total strings for the new results array
		for(int i = 0; i <= numOfConsecString; i++) {
			String consecStr = "";
			// We loop through the number of consecutive words needed to form new string
			for(int j = i; j < i + numStr; j++) {
				consecStr += strings[j];
			}
			// The concatenated string is added to results
			results.add(consecStr);
		}
		return results;
	}
	
	public static String getLongestString(ArrayList<String> strings) {
		String longest = "";
		for(int i = 0; i < strings.size(); i++) {
			if(strings.get(i).length() > longest.length()) {
				longest = strings.get(i);
			}
		}
		// The results are filtered and the first longest string is returned
		return longest;
	}

}
