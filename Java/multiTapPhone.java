// Author: Karan Goda
// https://www.codewars.com/kata/54a2e93b22d236498400134b
public class Keypad {
	public static int presses(String phrase) {
		  char[] phoneLetters = {'a','b','c','d','e','f','g','h','i',
	      'j','k','l','m','n','o','p','q','r','s','t','u','v','w',
	      'x','y','z', ' ', '1', '2', '3', '4', '5', '6', '7', '8', '9', '#', '*', '0', '0'};
		  int[] keyPress = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2,
		   3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 1, 4, 4, 4, 4, 4, 5, 4, 5, 1, 1, 1, 1};
		   int totalTimesPressed = 0;
		    for(int i = 0; i < phrase.length(); i++) {
		    	char characterInMsg = phrase.charAt(i);
		    	for(int j = 0; j < phoneLetters.length; j++) {
		    		char alphabetLetter = phoneLetters[j];
		    		if(Character.toLowerCase(characterInMsg) == Character.toLowerCase(alphabetLetter)) {
		    			totalTimesPressed += keyPress[j];
		    		}
		    	}
		      }
		    return totalTimesPressed;
		  }
}
