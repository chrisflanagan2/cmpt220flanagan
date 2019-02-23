package lab3;

public class lab3_4 {
	
public static void main(String[] args) {

int n;
int i=0;

for(n=14999;n>0;n--)

{ 

for(int j=1;i<=n;j++)

{

if(n%j==0)

{

j++;

}}



if(i==2)

break;

}

System.out.println("Largest n that is prime and less than 15000 is "+n);

}}

