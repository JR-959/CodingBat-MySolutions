
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

/* Problem #8
Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true
 */
	
	public boolean array6(int[] nums, int index) {
		  if(index >= nums.length)
		    return false;
		  else if(nums[index] == 6)
		    return true;
		  else{
		    index++;
		    return array6(nums, index);
		  }  
		}

/* Problem #9  
Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0
 */
	public int array11(int[] nums, int index) {
		  if(index >= nums.length)
		    return 0;
		  
		  if(nums[index] == 11){
		    index = index +1 ;
		    return 1 + array11(nums,index);
		  }
		  else{
		    index = index + 1;
		    return array11(nums,index);
		  }
		}

/* Problem #10  
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false
 */
	public static boolean array220(int[] nums, int index) {
		  if(index+1 >= nums.length)      //base case
		    return false;
		  
		  if((nums[index+1]/10) == nums[index] && (nums[index+1]%10) == 0)
		    return true;
		  else
		  {
		    index++;
		    return array220(nums,index);
		  }
		}
	
/* Problem #11	
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
 */
	
	public static String allStar(String str) {
		  if(str.length() == 0)
		    return "";
		  else if(str.length() == 1)
		    return str; 
		  else  
		    return str.substring(0,1) + "*" + allStar(str.substring(1));
		}

/*Problem #12
 Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a" 	
 */
	public String pairStar(String str) {
		  
		  if(str.length() <= 1)
		    return str;
		  else if(str.charAt(0) == str.charAt(1))
		    return str.substring(0,1) + "*" + pairStar(str.substring(1));
		  else
		    return str.substring(0,1) + pairStar(str.substring(1));
		}
	
/*Problem #13 	
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
*/
	public String endX(String str) {
		  if(str.length() == 0)
		    return str;
		  else if(str.substring(0,1).equals("x"))
		    return endX(str.substring(1)) + str.substring(0,1);
		  else
		    return str.substring(0,1) + endX(str.substring(1));
		}

/* Problem #14
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1	
*/
	public static int countPairs(String str) {
		  if(str.length() < 3 )
		    return 0;
		  else if(str.charAt(0) == str.charAt(2))
		    return 1 + countPairs(str.substring(1));
		  else
		    return countPairs(str.substring(1));
		}

/* Problem #15
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
*/
	public int countAbc(String str) {
		  if(str.length() < 3)
		    return 0;
		  else if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
		    return 1 + countAbc(str.substring(1));
		  else
		    return countAbc(str.substring(1));
		}



/* Problem #16
Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.

count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
 */

public int count11(String str) {
	  if(str.length() < 2)
	    return 0;
	  else if(str.substring(0,2).equals("11"))
	    return 1 + count11(str.substring(2));
	  else
	    return count11(str.substring(1));
	}

}// end of Recursion_Level1.java	
















