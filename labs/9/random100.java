package lab9;
import java.util.Random;
import java.util.Scanner;
public class random100 {
	public static void Main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int arrRand[]=new int [100];
		int randomNum;
		for (int i=0; i<100; i++) {
			randomNum = rand.nextInt(100);
			arrRand[i] = randomNum;
		}
		System.out.println("Enter an index of the array: ");
		int indx = sc.nextInt();
		try {
			System.out.println("Element at index "+ indx + " = "+arrRand[indx]);
			}
			catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Out of Bounds");
		}
		return;
	}
		
}
