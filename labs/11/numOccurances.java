package extraCredit;
import java.util.Scanner;
public class numOccurances {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string and character: ");
		String[] str = input.nextLine().split("[ ]");
		System.out.println("The character \'" + str[1] + "\' occurs " +
			count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
	}
	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}
	private static int count(String str, char a, int high) {
		if (high < 0) // Base case
			return 0;
		else if (str.charAt(high) ==  a) {
			return 1 + count(str, a, high - 1); 
		}
		else
			return count(str, a, high - 1); 
	}
}
