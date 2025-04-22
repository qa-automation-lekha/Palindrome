package day6;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome or not: ");
		int number = scanner.nextInt();
		int number1 = 0, result = 0,number2 = number;
		
		while(number>0)
		{
			number1 = number % 10;
			result = (result * 10) + number1;
			number = number / 10;
		}
		System.out.println("The reversed number is: "+result);
		if(number2 == result)
			System.out.println("The given number is Palindrome");
		else
			System.out.println("The given number is not Palindrome");
		scanner.close();
	}

}
