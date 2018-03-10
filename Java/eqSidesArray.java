package kat6;

public class eqSidesArray {

	public static void main(String[] args) {
		// TestCases
		int[]nums = {12,3,2,1,1,5};
		// Answer is 0
		System.out.println(findEvenIndex(nums));
		int[]nums2 = {5,1,2,100,3,5};
		// Answer is 3
		System.out.println(findEvenIndex(nums2));
		int[]nums3 = {5,100,5};
		// Answer is 1
		System.out.println(findEvenIndex(nums3));
	}

	public static int findEvenIndex(int[] arr) {
		 int arrLength = arr.length;
		 int i = 0;
	     if(arrLength == 0) {
	    	 return -1;
	     } else {
	    	 // Current left side array value
	    	 int sumLeft = arr[0];
		     int sumRight = 0;
		     // All array values except the first one are added for the right side
		     for(i = 1; i < arrLength; i++) {
		    	 sumRight += arr[i];
		     }
		     // We check if they equal on index 0 itself
		     if(sumRight == sumLeft) {
		    	 return 0;
		     } else {
		    	 // From right side amounts are subtracted, and from left amounts are
			     // added in order to find where they both intersect (equal each other)
			     // else return -1
		    	 for(i = 1; i < arrLength; i++) {
			    	 sumRight -= arr[i];
			    	 if(sumRight == sumLeft) {
			    		 return i;
			    	 }
			    	 sumLeft += arr[i];
			     }
			     return -1;
		     }
	     }
	  }
}
