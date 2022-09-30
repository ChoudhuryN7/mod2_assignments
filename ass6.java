/*06.	Write a program to convert temperature 
from Fahrenheit to Celsius. Take Fahrenheit as input
 using Scanner class. [ formula : C= 5*(f-32)/9 ]*/
 
import java.util.Scanner;
class ass6
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter fahrenheit value:");
float fr=obj.nextFloat();
float c=5*(fr-32)/9;
System.out.println("converted celsius value: "+c);
}
}
