package lab4;

public class lab_3 {
	
	
	public static String reverse(String s) {
		String str = "";
		for (int j=s.length ()-1;j>-1;j--){
			str+=s.charAt(j);
		}
		
		return str;
	}
	public static boolean isPalindrome(String s) {
		if (s.equals(reverse (s))) return true;
		else return false;
		
	}	
	public static void main(String[] args) {
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome ("laptop"));
		
	}
}
