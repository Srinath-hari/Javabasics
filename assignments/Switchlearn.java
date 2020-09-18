 package week1.assignments;

import java.util.Scanner;

public class Switchlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=0,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a= sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter the Operation:");
		sc.nextLine();
		String str=sc.nextLine();
		
		switch (str) {
		case "Add":
		result = a + b;
		System.out.println("Result of addition is: "+result);
		break;
		case "Subtract":
		result = a - b;
		System.out.println("Result of Subtraction is: "+result);
		break; 
		case "Multiply":
		result = a * b;
		System.out.println("Result of Multiplication is: "+result);
		break;
		case "Divide":
		result = a * b;
		System.out.println("Result of Division is: "+result);
		break;
		default:
			System.out.println("Please enter a valid operation");
			break;
		}
	}

}
