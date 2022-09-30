/*04.	Write a program to find the simple interest. 
Take the principle amount, rate of interest 
and time from user using Scanner class.*/
import java.util.Scanner;
class ass4{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter principle amount: ");
int principle=obj.nextInt();
System.out.println("Enter rate: ");
float rate=obj.nextFloat();
System.out.println("Enter no. of years: ");
int year=obj.nextInt();
temp call=new temp();
float res=call.si(principle,rate,year);
System.out.println("required Simple Interest is "+res);
}
}
class temp{


float si(int p,float r,int y)
{
	float m=p*r*y;
	float n=m/100;
	return n;
}

	
}