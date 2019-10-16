package com.david.java8;

public class Lambda {
	static int a = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//you can assign the anonymous method behavior to a reference 
		//of the functional interface. Then invoke the interface method.
		TestFunctionalInterface test = (a) -> {
			System.out.println("lambda without parameter 1");
		};

		test.test(a);
		
		//You can pass the anonymous method behaviour as an argument to any method.
		//PS: The method should be accepting the functional interface reference as an argument 
		sampleMethodForAcceptingLambdaExpressionAsArgument((a) -> {
			System.out.println("lambda without parameter 2");
		});

		//
	}

	private static void sampleMethodForAcceptingLambdaExpressionAsArgument(TestFunctionalInterface test) {
		// TODO Auto-generated method stub
		test.test(a);
	}

}
