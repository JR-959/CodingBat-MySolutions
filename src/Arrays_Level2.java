
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
	public static boolean either24(int[] nums) {
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
/* Problem #9
 
Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
 */
	public static int matchUp(int[] nums1, int[] nums2) {
		  int differByTwo = 0;
		  
		  for(int i=0; i < nums1.length; i++)
		  {
		    if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) < 3)
		      differByTwo++;
		  }
		  
		  return differByTwo;
		}
	
/* Problem #10
Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 */
	public static boolean has77(int[] nums) {
		  for(int i=1; i< nums.length-1; i++)
		  {
		    if(nums[i] == 7 && (nums[i-1]==7 || nums[i+1]==7))
		      return true;
		    else if(nums[i-1]==7 && nums[i+1]==7)
		      return true;
		      
		  }
		  
		  return false;
		}
/* Problem #11   
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */
	public static boolean has12(int[] nums) {
		  int one = 99;
		  int two = 0;
		  
		  for(int i=0; i< nums.length; i++)
		  {
		    if(nums[i] == 1)
		      one = i;
		    if(nums[i] == 2)
		      two = i;
		    
		    if(two != 0 && one< two)
		      return true;
		  }
		  
		  return false;
		}

/*Problem #12
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true	
*/
	public static boolean modThree(int[] nums) {
		  for(int i=2; i< nums.length; i++)
		  {
		    if(nums[i-1]%2 == 1 && nums[i-2]%2 == 1 && nums[i]%2 == 1)
		      return true;
		    
		    if(nums[i-1]%2 == 0 && nums[i-2]%2 == 0 && nums[i]%2 == 0) 
		      return true;
		  }
		  
		  return false;
		}

/*Problem #13  	
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
*/
	public static boolean tripleUp(int[] nums) {

		if(nums.length >2)
		{
		  for(int i=0; i< nums.length-2; i++)
		  {
		    if((nums[i+1] - nums[i]) == 1 && (nums[i+2] - nums[i+1]) == 1)
		      return true;
		  }
		}
		  
		  return false;
		}

/*Problem #14
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */
	public static int[] shiftLeft(int[] nums) {
		  for(int i=0; i< nums.length -1; i++)
		  {
		    int temp = nums[i];
		    nums[i] = nums[i+1];
		    nums[i+1] = temp;
		  }
		  
		  return nums;
		}

/* Problem #15
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4  
*/
	public int sum67(int[] nums) {
		  int sum =0;
		  
		  for(int i=0; i< nums.length;i++)
		  {
		    if(nums [i] == 6)
		    {
		      while(nums[i] != 7)
		        i++;
		    }
		    else
		    {
		      sum+= nums[i];
		    }
		    
		  }
		  return sum;
		}

/* Problem #16
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false  	
*/
	public boolean haveThree(int[] nums) {
		  int count = 0;

		  for(int i=0; i< nums.length; i++)
		  {
		    if(nums[i] == 3)
		      count++;
		    
		    if(i+1 < nums.length && nums[i] == 3 && nums[i+1] == 3)
		      return false;
		  }
		  
		  return (count == 3);
		}
/*Problem #17
Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false		
*/
	public boolean sameEnds(int[] nums, int len) {
		  for(int i=0; i< len; i++)
		  {
		    if(nums[i] != nums[nums.length-len+i])
		      return false;
		  }
		  
		  return true;
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}// end of Arrays_Level2
