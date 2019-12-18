package kat6;

public class txtingTimeWithBlackberries {

	public static void main(String[] args) {
		int msgLOL = presses("H3LL0 W0RLD");
		System.out.println(msgLOL);
		if(msgLOL == pressesBestSolution("H3LL0 W0RLD")) {
			System.out.println("Solution 2 is indeed better.");
		}

	}

	public static int presses(String phrase) {
		char[] phoneLetters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', '1', '2', '3', '4', '5', '6', '7', '8', '9', '#', '*',
				'0', '0' };
		int[] keyPress = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 1, 4, 4, 4,
				4, 4, 5, 4, 5, 1, 1, 1, 1 };
		int totalTimesPressed = 0;
		for (int i = 0; i < phrase.length(); i++) {
			char characterInMsg = phrase.charAt(i);
			for (int j = 0; j < phoneLetters.length; j++) {
				char alphabetLetter = phoneLetters[j];
				if (Character.toLowerCase(characterInMsg) == Character.toLowerCase(alphabetLetter)) {
					// System.out.println(keyPress[j]);
					totalTimesPressed += keyPress[j];
				}
			}
		}
		return totalTimesPressed;
	}

	public static int pressesBestSolution(String phrase) {
		String[] keys = { "1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#" };
		int nPresses = 0;
		for (char c : phrase.toUpperCase().toCharArray()) {
			for (String s : keys) {
				nPresses += s.indexOf(c) + 1;
			}
		}
		return nPresses;
	}

}
