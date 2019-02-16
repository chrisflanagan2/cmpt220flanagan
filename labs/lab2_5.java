package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class lab2_5 {
	
	public class Main {
	public void main(String[] args) {
	String firstString, secondString, thirdString;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter two different strings.");
	firstString = keyboard.nextLine();
	secondString = keyboard.nextLine();
	String[] array = new String[] {firstString, secondString};
	Arrays.sort(array);
	System.out.println("The string in the lexographic order are:");
	System.out.println(array[0] + ", " + array[1] );
	}
	}
}

