package lab6;
import java.util.Scanner;
public class BondTest {

	public static void main(String[] args) {
		double coupon;
		int payments; //question
		double interest;
		double valueMaturity;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the coupon amount $: ");
		coupon= sc.nextDouble();
		System.out.print("Enter number of payments: ");
		payments=sc.nextInt();
		System.out.print("Enter the interest rate %: ");
		interest=sc.nextDouble();
		System.out.print("Enter the value of maturity :");
		valueMaturity=sc.nextDouble();
		
		Bond b=new Bond(coupon, payments, interest, valueMaturity);
		System.out.printf("Price of the Bond $:%.2f\n",b.getPrice()); //question
	}

}
