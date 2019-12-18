package kat7;

public class jadenSmithSentences {

	public static void main(String[] args) {
		String test = "hmm lol l";
		test = toJadenCase(test);
		System.out.println(test);
	}

	public static String toJadenCase(String phrase) {
		String jadenPhrase = "";
		// EmptyArg test //NullArg test
		if(phrase.length() == 0 || phrase == null) {
		   return null;
		//test
		} else {
			if (Character.isLowerCase(phrase.charAt(0)) == true) {
				char firstLetter = Character.toUpperCase(phrase.charAt(0));
				jadenPhrase += firstLetter;
			}
			int i = 1;
			while (i < phrase.length()) {
				char whiteSpaceTest = phrase.charAt(i);
				if (Character.isWhitespace(whiteSpaceTest) == true) {
					whiteSpaceTest = Character.toUpperCase(phrase.charAt(i + 1));
					jadenPhrase += " ";
					jadenPhrase += whiteSpaceTest;
					if (i < whiteSpaceTest - 1) {
						i++;
					}
				} else {
					jadenPhrase += whiteSpaceTest;
				}
				i++;
			}
			return jadenPhrase;
		}
	}

}
