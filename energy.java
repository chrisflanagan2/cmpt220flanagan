package lab1;
import java.util.Scanner;
public class energy {
	public static void main(String[] args) {
	int SOL = 299972458;
	double mass;
	System.out.println("Enter a value for mass: ");
	Scanner reader = new Scanner(System.in);
    mass = reader.nextDouble();
	double E = mass * SOL;
	System.out.println("The potential energy of the object is "+ E);
}}
