// Java program to check whether a
// string is a Palindrome
// Using two pointing variables

// Main class
public class Palindrome {

	// Method
	// Returning true if string is palindrome
	static boolean isPalindrome(String str)
	{

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	// Method 2
	// main driver method
	public static void main(String[] args)
	{
		// Input string
		String str = "php";

		//Convert the string to lowercase
		str = str.toLowerCase();
		System.out.println("Written in uppercase :"+str);
		
	    
		System.out.println("Length of String is :"+str.length());
		
		// passing bool function till holding true
		
		if (isPalindrome(str))

			// It is a palindrome
			System.out.println("Yes,It is a palindrome");
		else

			// Not a palindrome
			System.out.println("No,It is Not a palindrome");
	}
}
