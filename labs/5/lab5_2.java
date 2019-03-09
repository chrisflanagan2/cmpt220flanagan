package lab_5;
import java.util.Scanner;
public class lab5_2 {

	public static double deviation(double[] x) {
		double dev = 0, length = x.length;	
		double mean = mean(x);
		for (int i=0;i<length;i++)
			dev += (x[i] - mean) * (x[i] - mean);
	return Math.sqrt(dev / length);
	}
	public static double mean(double [] x) {
	double length = x.length, mean = 0, sum = 0;
	for (double i:x)
		sum +=i;
		mean =sum/length;
	return mean;
	}
	public static void main (String []args) {
		double array[] = new double[10];
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter ten numbers ");
		for (int i=0;i<10;i++)
			array[i] = scan.nextDouble();
		System.out.println("Mean : " + mean(array));
		System.out.println("Standard Deviation: " + deviation(array));
	}
}