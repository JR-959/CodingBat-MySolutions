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
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
*/

public String repeatFront(String str, int n) {
	  String newOne = "";
	  for(int i = n ; i>=0 ;i--)
	  {
	    newOne += str.substring(0,i);
	  }
	  
	  return newOne;
	}

/* Problem #10
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
*/
public String repeatSeparator(String word, String sep, int count) {
	  
	  if(count == 0)
	    return "";
	  else
	  {
	    String newStr = word;
	    for(int i=1; i < count; i++)
	    {
	      newStr+= sep;
	      newStr+= word;
	    }
	    return newStr;
	  }
	}

/* Problem #11
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public boolean xyzMiddle(String str) {
	  boolean xyz = false;
	  
	  if(str.length() <3)
	    return xyz;
	    
	  for(int i=0; i< str.length()/2 ;i++)
	  {
	    if(str.substring(i,i+3).equals("xyz") && Math.abs(str.length()-2*i) <= 4)
	      xyz = true;
	  }
	  
	  return xyz;
	}

/* Problem #12
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") →   
*/
public String getSandwich(String str) {
	  int start = 0;
	  int end = 0;
	  for(int i=0; i< str.length()-5; i++)
	  {
	    if(str.substring(i,i+5).equals("bread"))
	    { 
	      start = i+5;
	      break;
	    }
	  }
	  
	  for(int i=0; i< str.length()-4 ; i++)
	  {
	    if(i+5 > start && str.substring(i,i+5).equals("bread"))
	      end = i;
	  }
	  
	  if(end > start)
	    return str.substring(start,end);
	  else
	    return "";
	}

/*Problem #13
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
*/
public String oneTwo(String str) {
	  String newStr ="";
	  for(int i=0; i< str.length()-2 ;i = i+3)
	  {
	      newStr += str.substring(i+1, i+3);
	      newStr += str.charAt(i);
	  }
	  
	  return newStr;
	}














	
}// end of Strings_Level3 Class
