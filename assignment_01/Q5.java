package assignment_01;
/*5Q. WAP in Java which would contain 8 objects of a Class Employee. 
Employee contains name, age, department, salary. Your program would 
be able to calculate the total salary to be paid in each department. Use 
constructors to create these 8 objects and Scanner to take inputs.
Restrictions:
1- Minimum 8 objects [can be created manually with parameterized 
constructors with Scanner input]
2- Departments are, A, B, C, D: minimum 4 departments [String Type]
3- If the Salary exceeds more than 30,000, then the default salary 
would be 25000 of any of the employee
4- Use array of objects, instead of using multiple 8 objects separately
Use: 
Employee arr[] = new Employee[8];
And
arr[i].department.equals("A")*/
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args)
	{
		System.out.println("shresht sharma_F_20011206");
		String s;
		int age;
		String depart;
		int salary;
		Scanner sc=new Scanner (System.in);
		Employee arr[] = new Employee[8];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter name , age, department(A,B,C,D) and salary of employee" + i+1);
			s=sc.next();
			age=sc.nextInt();
			depart=sc.next();
			salary=sc.nextInt();
			arr[i]=new Employee(s,age,depart,salary);
		}
		System.out.println("total salary payable in department A is : " + Employee.A);
		System.out.println("total salary payable in department B is : " + Employee.B);
		System.out.println("total salary payable in department C is : " + Employee.C);
		System.out.println("total salary payable in department D is : "  + Employee.D);



	}
}
class Employee{
	int salary;
	String department;
	int age;
	String name;
	static int A=0,B=0,C=0,D=0;
	//Default constructor;
	Employee(){
		
	}
	Employee(String nm,int ag,String dep,int sal){
		name=nm;
		age=ag;
		department=dep;
		if(sal>30000)
		{
			salary=25000;
		}
		else 
			salary=sal;
		if(department.equals("A")) {
			A+=salary;
		}
		else if(department.equals("B"))
		{
			B+=salary;
		}
		else if(department.equals("C"))
		{
			C+=salary;
		}
		else
		{
			D+=salary;
		}
	}
}