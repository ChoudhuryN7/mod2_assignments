/*08.	In a company an employee is paid as under:
 If his basic salary is less than Rs. 10000, 
 then HRA = 10% of basic salary and DA = 90% of basic salary. 
 If his salary is either equal to or above Rs. 10000, 
 then HRA = Rs. 2000 and DA = 98% of basic salary. 
 If the employee's salary is input by the user write a program to find his gross salary. 
 [ formula : GS= Basic + DA + HRA ]*/
 
 import java.util.Scanner;
 class ass8{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("enter basic salary:");
 int s=obj.nextInt();
 float hra,da;
 if(s<10000)
    {
	hra=(10*s)/100;
	da=(90*s)/100;
	}
else
{
hra=2000;
da=(98*s)/100;
}
float gs=s+da+hra;
System.out.println("Gross salary will be: "+gs);	
 }
 }