// Author: Karan Goda
// https://www.codewars.com/kata/57f6ad55cca6e045d2000627
public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
  for(int i = 0; i < array.length; i++) {
    int testNum = (int)Math.sqrt(array[i]);
     if(testNum * testNum == array[i]) {
       array[i] = (int)Math.sqrt(array[i]);
     } else {
      //If the sqrt of the num is not possible multiple it by itself.
      array[i] = array[i] * array[i];
     }
  }
    return array;
  }
}
