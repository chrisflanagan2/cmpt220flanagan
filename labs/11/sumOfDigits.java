package extraCredit;
import java.util.Scanner;

public class sumOfDigits {
	  
	static int sum = 0;
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the number: ");
	try{
		int number = sc.nextInt();
		System.out.println("Sum is: " + sumOfDigits.SumDigits(number));
	}
	catch(Exception e){
		System.out.println("enter a number please: "+e);
	}
	}
	public static int SumDigits(long number) {
	  
	if (number == 0) {
		return sum;
	} else {
		sum += (number % 10);
		SumDigits(number / 10);
	}
	return sum;
	}
	
}
