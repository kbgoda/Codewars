// Author: Karan Goda
// https://www.codewars.com/kata/56606694ec01347ce800001b
class TriangleTester{
	public static boolean isTriangle(int a, int b, int c){
    //If inputs are positive, proceed
	   if(a >= 1 && b >= 1 && c >= 1) {
       //If 2 sides are greater than the third, a triangle can be formed
	     if(a + b > c && a + c > b && b + c > a) {
	       return true;
	      } else {
	       return false;
	      }
       } else {
	       return false;
       }
	  }
  }
