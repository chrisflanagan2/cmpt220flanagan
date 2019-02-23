package lab3;

import java.util.Scanner;

public class lab3_6 {
	
public static int vowels(String s) 

{

s = s.toLowerCase();
        
int count = 0;
        
char v;
        
for(int j = 0; j < s.length(); ++j) 

{
            
v = s.charAt(j);
            
if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')

{
                
++count;
            
}}

return count;

}

public static void main(String[] args) 

{
        
Scanner in = new Scanner(System.in);
        
System.out.print("Enter a string: ");

String str = in.nextLine();

System.out.println("Number of vowels in '" + str + "' is " + vowels(str));

}}

