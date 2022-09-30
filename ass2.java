/*02.	Write a program that takes radius of a circle as input. 
Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.*/
import java.util.Scanner;
class ass2{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int radius= obj.nextInt();
n obj1=new n();
float area=obj1.area(radius);
float circum=obj1.circum(radius);
System.out.println("Required area= "+area);
System.out.println("Required circumference= "+circum);



}
}
class n{
float pi=3.14f;

float area(int r)
{
float ra=pi*r*r;
return ra;
}
float circum(int r)
{
	float res=2*pi*r;
	return res;
}
}