package lab7;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		StackOfIntegers stack = new StackOfIntegers();
		int num = 0;
		// JA: You need to read the numbers
		num = input.nextInt();
		findFactors(num ,stack);
		int size = stack.getSize();
		for (int i=0; i<size; i++) {
			System.out.print(stack.pop() + " ");
		}
		
	}
	public static void findFactors(int num, StackOfIntegers stack) {
		for (int k=2; k<=num; k++) {
			while (num %k==0) {
				stack.push(k);
				num=num/k;
			}
		}
				

	}

}
