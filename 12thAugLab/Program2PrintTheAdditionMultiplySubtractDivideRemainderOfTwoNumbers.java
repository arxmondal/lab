// Q5. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner; // Importing Scanner Class.

public class Program2PrintTheAdditionMultiplySubtractDivideRemainderOfTwoNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
   
  		System.out.print("Input first number: ");
		int num1 = sc.nextInt();   
		System.out.print("Input second number: \n");
		int num2 = sc.nextInt(); 
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));		   
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
	}
 
}
