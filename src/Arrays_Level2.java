
public class Arrays_Level2 {

	public static void main(String[] args) {
		

	}// end of main
	
/* Problem #1
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */
	
	public static boolean has22(int[] nums) {
		  for(int i=1; i< nums.length; i++)
		  {
		    if(nums[i-1] == 2 && nums[i] == 2) 
		        return true;
		  }
		  
		  return false;
		}
/* Problem #2
Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */
	
	public static boolean lucky13(int[] nums) {
		  boolean noOne = true;
		  boolean noThree = true;
		  
		  for(int i=0; i< nums.length; i++)
		  {
		    if(nums[i] == 1)
		      noOne = false;
		    else if (nums[i] == 3)
		      noThree = false;
		  }
		  
		  if(noOne && noThree)
		    return true;
		  else
		  return false;
		    
		}

/* Problem #3
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */
	
	public static boolean sum28(int[] nums) {
		  int sumOfTwos = 0;
		  
		  for(int i=0; i< nums.length; i++)
		  {
		    if(nums[i] == 2)
		      sumOfTwos+= nums[i];
		  }
		  
		  if(sumOfTwos == 8)
		      return true;
		  else
		    return false;
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end of Arrays_Level2
