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

	
}
