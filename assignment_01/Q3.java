package assignment_01;
//Q3- Given an interface in1 which includes a method display which takes 
//an integer as input .
//interface In1
//{
// void display(int p);
//}
//Task is to write a class testClass which implements interface In1 and has 
//a method named display which takes an integer as an input p and the 
//display method should be able to tell if the number is prime or not?
//- The main method should not be in testClass, create a separate class for 
//that.
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args)
	{
		System.out.println("Shresht_Sharma_F_20011206");
		testClass obj=new testClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check if it is prime or not");
		int p=sc.nextInt();
		obj.display(p);
	}
}
interface in1{
	 void display(int p);
}
class testClass implements in1{
	public  void display(int p)
	{
		int count =0;
		for(int i=2;i<=p;i++)
		{
			if(p%i==0)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("It is not a prime number");
		}
		else
			System.out.println("it is a prime number");
	}
}