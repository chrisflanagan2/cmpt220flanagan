package lab4;

public class Lab4_4 {
	public static void main(String[] args)
	   {
	        String s="The quick brown fox jumps over the lazy dog";
	       int[] j=new int[26];
	       int[] k=new int[26];
	       for(int i=0;i<26;i++)
	       {
	           j[i]=0;
	       }
	       for(int i=0;i<26;i++)
	       {
	           k[i]=0;
	       }
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)-65>=0&&s.charAt(i)-65<26)
	            {
	                j[s.charAt(i)-65]++;
	            }
	            if(s.charAt(i)-97>=0&&s.charAt(i)-97<26)
	            {
	                k[s.charAt(i)-97]++;
	            }
	        }
	        for(int i=0;i<26;i++)
	        {
	            if(k[i]!=0)
	            System.out.printf("Total occurence of %c is %d\n",i+97,k[i]);
	            if(j[i]!=0)
	            System.out.printf("Total occurence of %c is %d\n",i+65,j[i]);

	        }
	      
	   }
	}

