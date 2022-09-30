/*03.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks 
from user using Scanner class. Output should
 be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/
 
 import java.util.Scanner;
 class ass3{
 public static void main(String args[])
 {
 Scanner ob=new Scanner(System.in);
 int[] arr=new int[5];
 System.out.println("--------highest total marks of the 5 subjects is 500.-------");
 System.out.println("Please enter the secured marks of the 5 subjects:");
 for(int i=0;i<arr.length;i++)
 {
 arr[i]=ob.nextInt();
 }
 for(int i=0;i<arr.length;i++)
 {
	System.out.print(arr[i]+" "); 
 }
 int sum=0;
 for(int i=0;i<arr.length;i++)
    {
	 sum+=arr[i];
	 }
for(int i=0;i<arr.length;i++)
{	
 if(arr[i]>100)
	    {
		 System.out.println("please enter marks obtained under 100.");
	     System.exit(0);
		 }
}
    System.out.println("total sum= "+sum);
    int total=500; // 
    int per=(sum*100)/total;
    System.out.println("Percentage acheived is: "+per+" %");
	 

 }
 
 }
 