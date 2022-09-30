/*05.	Write a program to read the days (eg. 670 days) 
as integer value using Scanner class. Now convert 
the entered days into complete years, months and days and print them.*/


import java.util.Scanner;
class ass5
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the no. of days yo want to convert ");
int days=ob.nextInt();
int y=days/365;       // first years is calculated
int rem=days%365;     // after years is calculated, remaining days is then procured 
int m=rem/30;         //remaining days is converted to months 
int d=rem%30;         //after months is calculated, remaining days is procured 
System.out.println("converted: "+y+" years,"+m+" months,"+d+" days.");

}
}