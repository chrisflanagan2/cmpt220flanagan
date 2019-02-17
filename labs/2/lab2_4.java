package lab2;

import java.util.Scanner;
	public class lab2_4 {
	// JA
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int first_num;
		int second_num;
		System.out.print("Enter first character: ");
		first_num = keyboard.next().charAt(0); 
		System.out.print("Enter second character: ");
		second_num = keyboard.next().charAt(0);
		int result = first_num + second_num;
		System.out.println("Result is: " + result );
	}
}

