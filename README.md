# CodingBat-MySolutions
My solutions for the challenges exercises from codingbat.com. Purpose: extra practice and solidify common code patterns 

## About CodingBat
CodingBat is a free site of live coding problems to build coding skill in Java and Python (example problem). CodingBat 
is a project by Nick Parlante, a computer science lecturer at Stanford.

Going through many practice problem is a great way to solidify your understanding of how the code should work. CodingBat 
problems work great as homework, or for self-study practice, or in a lab, or as live lecture examples. The CodingBat 
problems are designed to have low overhead: short problem statements (like an exam), nothing to install, immediate feedback
in the browser, and there's lots of them to build up those skills. 

## Sample Challenge
```
 * Problem #7 Given a string, compute recursively a new string where all the 'x'
 * chars have been removed.
 * 
 * noX("xaxb") → "ab" 
 * noX("abc") → "abc" 
 * noX("xx") → ""
 */
public static String noX(String str) {
	if (str.length() == 0)
		return "";
	else if (str.substring(0, 1).equals("x"))
		return noX(str.substring(1));
	else
		return str.substring(0, 1) + noX(str.substring(1));
}
```
