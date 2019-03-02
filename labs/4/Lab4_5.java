package lab4;
import java.util.Random;
public class Lab4_5 {
	public static void main(String[] args)
	   {
	      double avg=0;
	      
	      int[] j=new int[1000];
	       
	        Random rand = new Random();

	    for(int i=0;i<1000;i++)
	        {
	            j[i] = rand.nextInt(10000);
	      
	            avg=avg+j[i];
	        }
	        avg=avg/1000.0;
	        int count1=0,count2=0;
	    for(int i=0;i<1000;i++)
	    	
	    {
	        if(j[i]<avg)
	        count1++;
	        
	        if(j[i]>avg)
	        count2++;
	    }
	    System.out.println("Numbers less than average are "+count1);
	    System.out.println("Numbers greater than average are "+count2);
	   }
}
