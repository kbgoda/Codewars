// Author: Karan Goda
// https://www.codewars.com/kata/5390bac347d09b7da40006f6
public class JadenCase {

	public String toJadenCase(String phrase) {
		String jadenPhrase = "";
    //NullArg test
    if(phrase == null) {
      return null;
    //EmptyArg test
    } else if(phrase.equals("")) {
      return null;
    } //test
    else {
    if(Character.isLowerCase(phrase.charAt(0)) == true) {
       char firstLetter = Character.toUpperCase(phrase.charAt(0));
       jadenPhrase += firstLetter;
      }
    int i = 1;
    while(i < phrase.length()) {
      char whiteSpaceTest = phrase.charAt(i);
       if(Character.isWhitespace(whiteSpaceTest) == true) {
           char SpaceTest = Character.toUpperCase(phrase.charAt(i+1));
           jadenPhrase += " ";
           jadenPhrase += SpaceTest;
           i++;
         } else {
         jadenPhrase += whiteSpaceTest;
          }
          i++;
       }
		return jadenPhrase;
    }
  }
}
