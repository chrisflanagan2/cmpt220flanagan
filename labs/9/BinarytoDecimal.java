package lab9;

public class BinarytoDecimal {
	public static int bin2Dec(String binaryString) {
	       int number = 0;
	       int i = 0;
	       int j = binaryString.length() - 1;
	       while (i < binaryString.length()) {
	           if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1') {
	               throw new NumberFormatException("Not a binary String");
	           }
	           String digit = String.valueOf(binaryString.charAt(i));
	           number += (Integer.parseInt(digit)) * Math.pow(2, j);
	           i++;
	           j--;
	       }
	       return number;
	   }

	   public static void main(String[] args) {
	       System.out.println("Decimal of 101010: "+bin2Dec("101010"));
	       
	   }
}
