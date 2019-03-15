package lab_5;
import java.util.Scanner;
public class lab5_1 {
	public static double max(double[] array) {
		double num = array[0];
		for (int x = 0; x < array.length; x++) 
			if (array [x] > num)
				num =array [x];
		return num;	
	}
	public static void main (String[]args) {
		System.out.println ("Enter 10 numbers: ");
		double array[] = new double[10];
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<10; i++)
			array[i] = sc.nextDouble();
		System.out.println ("Maximum element in the array is: " + max(array));

	}
	

}