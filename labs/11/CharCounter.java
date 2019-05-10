package extraCredit;
import java.util.Scanner;

public class CharCounter {
	
	public static int count(char[] chars, char ch) {
	       return count(chars, ch, chars.length-1);
	   }
	   public static int count(char[] chars, char ch, int high) {
	       if(high < 0)
	           return 0;
	       else if(chars[high] == ch)
	           return 1 + count(chars, ch, high-1);
	       else
	           return count(chars, ch, high-1);
	   }

	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter list of character: ");
	       char[] chrs = sc.nextLine().toCharArray();
	       System.out.print("Enter a character: ");
	       char c = sc.next().charAt(0);
	System.out.println("Count: "+count(chrs, c));

	   }
}
