package com.david.programs.arrays;

/**
 * Hello world!
 *
 */
public class ArrayPrograms 
{
    public static void main( String[] args )
    {
//    	How to find the missing number in integer array of 1 to 100 ?
//    	How to find duplicate number on Integer array in Java?'
//    	How to check if array contains a number in Java?
//    	How to find largest and smallest number in unsorted array?
//    	Write a program to remove duplicates from array in Java?
//    	How find the first repeating element in an array of integers?
//    	How to reverse array in place in Java?

    	swap();
//    	printReverseArray();
    	
    }

	private static void printReverseArray() {
		int [] origArray = {1, 2, 3, 4, 5};
		int [] reverseArray = new int [origArray.length];
		int j = 0;
		
		for (int i = origArray.length -1 ; i >=0 ; i--) {
			reverseArray[j] = origArray[i];
			j ++;
		}
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.print(reverseArray[i]);
		}
	}

	private static void swap() {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
//		int temp = a;
//		a = b ;
//		b = temp;
		a = a + b;
		b = a- b;
		a = a-b;
		System.out.println("a: "+ a+" b : "+b);
	}

}
