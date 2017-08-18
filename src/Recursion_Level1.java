
public class Recursion_Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
/*Problem#1
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
*/
	public static int powerN(int base, int n) {
		  if(n==0)
		    return 1;
		  else 
		    return base * powerN(base, n-1);
		}

/*Problem #2
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/
	public static int countX(String str) {
		  if(str.length() == 0)
		    return 0;
		    
		  String letter = str.substring(0,1);
		  String theRest = str.substring(1);  
		    
		  if(letter.equals("x"))
		    return 1+countX(theRest);
		  else
		    return 0 + countX(theRest);
		}


/*Problem #3
 Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/
public static int countHi(String str) {
	  if(str.length() == 0 || str.length() <2)
	    return 0;
	    
	  String letter = str.substring(0,2);
	  String theRest = str.substring(1);  
	    
	  if(letter.equals("hi"))
	    return 1+countHi(theRest);
	  else
	    return 0 + countHi(theRest);

}

/*Problem #4
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
 */

public static int triangle(int rows) {
	  if(rows == 0)
	    return 0;
	  else
	    return rows+ triangle( rows-1);
	}

/*Problem #5
 Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
 */
public int sumDigits(int n) {
	  if(n>0)
	    return n%10 + sumDigits(n/10);
	  else
	    return 0;
	  
	}

/*Problem #6
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */

public static String changePi(String str) {
	  if(str.length() == 0)
	    return "";
	  if(str.length() > 1 && str.substring(0,2).equals("pi")) 
	      return ("3.14" + changePi(str.substring(2)));
	  else
	      return str.substring(0,1) + changePi(str.substring(1));
	  
	}

/* Problem #7
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/
	public static String noX(String str) {
	  if(str.length() == 0)
	    return "";
	  else if(str.substring(0,1).equals("x"))
	    return noX(str.substring(1));
	  else
	    return str.substring(0,1) + noX(str.substring(1));
	}


}// end of Recursion_Level1.java	



















