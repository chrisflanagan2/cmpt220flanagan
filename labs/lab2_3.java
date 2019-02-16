package lab2;

import java.util.Scanner;
import java.util.Random;
public class lab2_3 {
	   public static void main(String[] args) {

		    int num1;
		    int num2;
		    Scanner sc = new Scanner(System.in);

		   System.out.println("Enter lower limit integer");
		   num1 = sc.nextInt();
		   System.out.println("Enter upper limit integer");
		   num2 = sc.nextInt();
		   for (int a = 0; a < 3; a++) {
		           System.out.println(random_number(num1, num2));
		   }
		   }

		   private static int random_number(int num1, int num2) {

		       if (num1 >= num2) {
		           throw new IllegalArgumentException("max must be greater than min");
		       }

		       Random r = new Random();
		       return r.nextInt((num2 - num1) + 1) + num1;
		   }
		}

