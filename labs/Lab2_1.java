
package lab2;

import java.util.Scanner;
public class Lab2_1 {
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	System.out.println("Enter first number");
	num1 = sc.nextInt();
	System.out.println("Enter second number");
    num2 = sc.nextInt();
	System.out.println(num1+" less than "+num2 +" "+(num1<num2));
	System.out.println(num1+" less than equal "+num2 +" "+(num1<=num2));
	System.out.println(num1+" equal to "+num2 +" "+(num1==num2));
	System.out.println(num1+" not equal to "+num2 +" "+(num1!=num2));
	System.out.println(num1+" greater than "+num2 +" "+(num1>num2));
	System.out.println(num1+" greater than equal to "+num2 +" "+(num1>=num2));
	
			

}
}