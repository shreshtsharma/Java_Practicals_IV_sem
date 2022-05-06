package assignment_01;
/*Q4. Create a multi-level inheritance hierarchy from ClassOne, ClassTwo, 
ClassThree classes.
ClassOne contains one, single parameterized constructor
ClassTwo contains only a default constructor
ClassThree contains one, single parameterized constructor and a default 
constructor.
Create an object of top child class and make sure the constructor 
execution will take place according to respective multi-level inheritance 
hierarchy.
ClassThree obj = new ClassThree(1);
ClassThree obj = new ClassThree();
*/
public class Q4 {
	public static void main(String[] args)
	{
		System.out.println("shresht sharma_F_20011206");
		Three obj=new Three(1);
	}


}
class One{
	One(){
		
	}
	One(int a){
		System.out.println("in class One");
	}
}
class Two extends One{
	Two(){
	super(1);
	System.out.println("In class Two");
	}
}
class Three extends Two{
	
	Three(){
	
	}
	//default constructor;
	Three(int b){
		System.out.println("In class Three");
	}
}