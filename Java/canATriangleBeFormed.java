package kat7;

public class canATriangleBeFormed {

	public static void main(String[] args) {
		boolean something = isTriangle(3, 4, 3);
		System.out.println(something);

	}

	public static boolean isTriangle(int a, int b, int c){
	   if(a >= 1 && b >= 1 && c >= 1) {
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
