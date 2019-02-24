package lab3;
// JA: This needs to be formatted
public class lab3_4 {
	
	public static void main(String[] args) {
		int n;
		int i=0;

		for(n=14999;n>0;n--)
		{ 
			if (isPrime(n))
				break;
		}
		System.out.println("Largest n that is prime and less than 15000 is "+n);
	}
	
	public static boolean isPrime(int n) {
		for(int j=2;j<n;j++)
		{
			if(n%j==0)
			{
				return false;
			}
		}
		return true;
	}
}


