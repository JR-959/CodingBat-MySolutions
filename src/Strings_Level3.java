public class Strings_Level3 {
/* Problem #1
 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
	
	boolean doubleX(String str) {
		  for(int i=0; i< str.length()-1; i++)
		  {
		    if(str.charAt(i) == 'x')
		    {
		      if(str.charAt(i+1) == 'x' )
		        return true;
		      else
		        return false;
		    }
		  }
		  
		  return false;
		}

/*Problem #2
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"	
*/
	public String altPairs(String str) {
		  String newOne = "";
		  for(int i=0; i< str.length(); i = i+4)
		  {
		    if(i+1 < str.length())
		      newOne += str.substring(i,i+2);
		    else
		      newOne += str.substring(i);
		  }
		  
		  return newOne;
		}

/* Problem #3 
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
	
	int countXX(String str) {
		  int xS = 0;
		  for(int i=0; i<str.length()-1; i++)
		  {
		    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x')
		      xS++;
		  }
		  
		  return xS;
		}

/* Problem #4 
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
	public String stringX(String str) {
		  String newOne = "";
		  for(int i=0; i< str.length(); i++)
		  {
		    if(str.charAt(i) == 'x' && (i>0 && i< str.length()-1))
		    {}  //empty block: no action
		    else
		      newOne += str.charAt(i);
		  }
		  return newOne;
		}
/* Problem #5 
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
	public String stringYak(String str) {
		  String newOne = "";
		  int i =0;
		  
		  while(i < str.length())
		  {
		    if(i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k')
		      i+=3;
		    else
		    {
		      newOne+= str.charAt(i);
		      i++;
		    }
		  }
		  
		  return newOne;
		}
/*Problem #6
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true 
*/
	public boolean has271(int[] nums) {

		  for(int i=0; i< nums.length-2; i++)
		  {
		    if(nums[i+1] - nums[i] == 5 && Math.abs(nums[i+2] - nums[i] + 1) <= 2)
		      return true;
		  }
		  
		  return false;
		}
	

/*Problem #7
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
public boolean xyBalance(String str) {
	  int x = -1;
	  int y = -1;
	  for(int i=0; i< str.length(); i++)
	  {
	    if(str.charAt(i) == 'x')
	      x = i;
	    
	    if(str.charAt(i) == 'y')
	      y = i;
	  }
	  
	  return (y>=x);
	}

/* Problem #8
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre" 
*/

public String mixString(String a, String b) {
	  String newOne = "";
	  int length = Math.min(a.length(), b.length());
	  for(int i=0; i< length; i++)
	  {
	    newOne+= a.charAt(i);
	    newOne+= b.charAt(i);
	  }
	    newOne += a.substring(length);
	    newOne += b.substring(length);
	  
	  return newOne;
	}

/* Problem #9
* 
*/
	
}// end of Strings_Level3 Class
