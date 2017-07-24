// Author: Karan Goda
// https://www.codewars.com/kata/514b92a657cdc65150000006
public class Solution {

  public int solution(int number) {
    /*Checks whether the number is divisible by 3, 5 or both
    and adds it to another variable which is returned. */
    int sum = 0;
      for(int i = 0; i < number; i++) {
          if(i % 3 == 0 || i % 5 == 0 || i % 3 == 0 && i % 5 == 0) {
              sum += i;
            }
        }
        return sum;
  }
}
