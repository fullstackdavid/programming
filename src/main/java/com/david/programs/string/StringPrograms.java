package com.david.programs.string;

/**
 * Hello world!
 *
 */
public class StringPrograms 
{
    public static void main( String[] args )
    {
//    	How to Print duplicate characters from String?
//    	How to check if two Strings are anagrams of each other?
//    	How to program to print first non repeated character from String?
//    	How to reverse String in Java using Iteration and Recursion?
//    	reverseStringUsingStringBuilder();
//    	reverseStringRecursively();
//    	How to find duplicate characters in a String?
    	findDuplicateCharactersInAString();
//    	How to count a number of vowels and consonants in a String?7. How to count the occurrence of a given character in String?8. How to reverse words in a sentence without using a library method?
//    	How to return highest occurred character in a String?
//    	Write a program to remove a given character from String?
    }

	private static void findDuplicateCharactersInAString() {
		String str = "Illusion";
		
	}

	private static void reverseStringRecursively() {
		reverseIt("OriginalString");
		
	}

	private static void reverseIt(String string) {
		// TODO Auto-generated method stub
		if(string.length() ==0) {
			return;
		}
		System.out.print(string.charAt(string.length()-1));
		reverseIt(string.substring(0, string.length()-1));
	}

	private static void reverseStringUsingStringBuilder() {
		// TODO Auto-generated method stub
		String str = "OriginalString";
		StringBuilder reverse = new StringBuilder();
		for (int i = str.length() -1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		System.out.println(reverse);
		
	}
}
