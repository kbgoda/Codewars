// Author: Karan Goda
// https://www.codewars.com/kata/5842df8ccbd22792a4000245
public class Kata
{
   	public static String expandedForm(int num) {
		int[] numsToHold = new int[11];
		int[] flippedArr = new int[numsToHold.length];
		int multiplier = 10;
		String expandedForm = "";

		for (int i = 1; i < 11; i++) {
			numsToHold[i] = getDigitPlace(num, 10, i);
		}
		//Makes number expanded and stores in an array
		for (int j = 2; j < numsToHold.length; j++) {
			numsToHold[j] *= multiplier;
			multiplier *= 10;
		}

		flippedArr = revArray(numsToHold);
		//If number in flipped array isn't zero, it will add it in a string
		for (int traverseArr = 0; traverseArr < flippedArr.length; traverseArr++) {
			if (flippedArr[traverseArr] != 0) {

				String numToAddToStr = String.valueOf(flippedArr[traverseArr]);
				expandedForm += numToAddToStr + " + ";
			}
		}
		expandedForm = expandedForm.substring(0, expandedForm.length() - 3);
		return expandedForm;
	}
  //Gets the number in a place
	public static int getDigitPlace(int number, int base, int n) {
		return (int) ((number / Math.pow(base, n - 1)) % base);
	}
  //Flips array
	public static int[] revArray(int[] num) {
		int[] reversedNum = new int[num.length];
		for (int i = num.length - 1; i >= 0; i--) {
			reversedNum[(num.length - i - 1)] = num[i];
		}
		return reversedNum;
	}
}
