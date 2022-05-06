package assignment_01;
/*Q2- WAP to count the total number of calls for a member function from 
more than one objects. [Let’s say, from 3 such Objects] */
public class Q2 {
	public static void main(String[] args)
	{
		test obj1=new test();
		test obj2=new test();
		test obj3=new test();
		obj1.fun();
		obj2.fun();
		obj3.fun();
		obj1.fun();
		System.out.println("Shrehst sharma_F_20011206");
		System.out.println("total number of calls for function fun() of class test is : " + test.count);
	}
}
class test{
	static int count=0;
	void fun() {
		 ++count;
	}
}