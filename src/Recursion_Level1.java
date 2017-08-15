
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
public int countHi(String str) {
	  if(str.length() == 0 || str.length() <2)
	    return 0;
	    
	  String letter = str.substring(0,2);
	  String theRest = str.substring(1);  
	    
	  if(letter.equals("hi"))
	    return 1+countHi(theRest);
	  else
	    return 0 + countHi(theRest);

}


}// end of Recursion_Level1.java	



















