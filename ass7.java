/*07.	Write a program to swap two numbers without using third variable.*/
import java.util.Scanner;
class ass7{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Please enter the number to be swapped:");
int x=ob.nextInt();
int y=ob.nextInt();
System.out.println("So,Number to be swapped are x="+x+"and y="+y);
//the logic
x=x+y;
y=x-y;
x=x-y;
System.out.println("after swap: x="+x+" y="+y);
}


}