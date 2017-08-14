
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

/* Problem #4
 Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
	public static boolean more14(int[] nums) {
		  int ones = 0;
		  int fours =0;
		  
		  for(int i=0; i< nums.length; i++)
		  {
		    if(nums[i] == 1)
		      ones++;
		    if(nums[i] == 4)
		      fours++;
		  }
		  
		  return (ones>fours);
		}

/* Problem #5 
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */
	
	public static boolean only14(int[] nums) {
		  for(int i=0; i< nums.length; i++)
		  {
		    if(nums[i] != 1 && nums[i] != 4)
		      return false;
		  }
		  
		  return true;
		}

/*Problem #6
 Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */
	public static boolean no14(int[] nums) {
		  int ones = 0;
		  int fours = 0;
		  
		  for(int i=0; i< nums.length; i++)
		  {
		    if(nums[i] == 1){ 
		      ones++;
		    }
		    else if(nums[i] == 4){
		      fours++;
		    }
		  }
		  
		  if(ones == 0 || fours == 0)
		    return true;
		  
		  return false;
		}

/*Problem #7
 
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false 
 */
	public static boolean isEverywhere(int[] nums, int val) {
		  
		  for(int i=1; i< nums.length; i++)
		  {
		    if(nums[i] != val && nums[i-1] != val)
		      return false;
		    
		  }
		  
		  return true;
		}

/* Problem #8
 Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false	
 */
	public boolean either24(int[] nums) {
		  int twos = 0;
		  int fours = 0;
		  
		  for(int i=1; i< nums.length; i++)
		  {
		    if(nums[i] == nums[i-1])
		    {
		      if(nums[i] == 2) 
		        twos++;
		      else if(nums[i] == 4)
		        fours++;
		    }
		  }
		  
		  return (twos > fours || fours > twos);
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end of Arrays_Level2
